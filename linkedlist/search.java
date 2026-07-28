package linkedlist;

public class search {
    class Node{
        int data ;
    Node next;
    public Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    
    public static Node head;
    public static Node tail;  
     
    public void print(){
        if(head == null){
           System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = tail = newNode;
        return;
    }

    tail.next = newNode;
    tail = newNode;
    }

    public int searchnum(int key){
        int idx = 0;
        Node temp = head;
        while(temp!= null){
            if(temp.data == key){
                return idx;
            } 
            temp = temp.next;
            idx++;
        }

        return -1;

    }
    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0; 
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;


    }

    public int recsearch(int key){
        return helper(head , key);
    }

    public static void main(String[] args) {

        search LL = new search(); 
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(6);
         LL.add(9);  
        LL.add(7);
        LL.print();

        System.out.println("itr search->");

        System.out.println("key found at : " + LL.searchnum(3));
        System.out.println( LL.searchnum(10));

        System.out.println("recurrsive search->");

        System.out.println("key found at : " + LL.recsearch(6));
        System.out.println( LL.recsearch(18));


        

        
    }
    
}

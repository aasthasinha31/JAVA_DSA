package linkedlist;

public class reverseLL {
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
    
    public void reverse(){

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }
    
    

    public static void main(String[] args) {

        reverseLL LL = new reverseLL(); 
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(6);
        LL.add(9);  
        LL.add(7);
        LL.print();

        LL.reverse();

        LL.print() ;

        


        

        
    }
}

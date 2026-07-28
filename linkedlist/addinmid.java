package linkedlist;

public class addinmid {
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

    public void addmid(int idx , int data){
        if(idx == 0){
        addfirst(data);
           return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
       }
    public void addlast(int data){
        
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode ;
    }
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
       newNode.next = head;

        head = newNode;

    }


    

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

    public static void main(String[] args) {
        addinmid LL = new addinmid();
        LL.addfirst(1);
         
        LL.addfirst(5);
        
         
        LL.addlast(9);
         

         LL.addmid(2,3);
          LL.print();
        

    }
    
}

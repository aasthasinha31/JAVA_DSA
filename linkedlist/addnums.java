package linkedlist;



public class addnums {
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

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
       newNode.next = head;

        head = newNode;

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
        addnums LL = new addnums();
        LL.addfirst(1);
         LL.print();
        LL.addfirst(3);
         LL.print();
        LL.addfirst(5);
         LL.print();
        LL.addfirst(7);
         LL.print();
        LL.addlast(9);

        LL.print();
        

    }

    
}

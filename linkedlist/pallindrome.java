package linkedlist;

public class pallindrome {

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

    public Node mid(Node mid){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public boolean Pallindrome(){
        if ( head == null || head.next == null){
            return true;
        }

        //find mid
        Node midNode = mid(head);
        

        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        

        Node right = prev;
        Node left = head;



        //check 1st half == 2nd half or not
       while (right != null){
        if(right.data != left.data){
            return false;
        }
        right =right.next;
        left = left.next;
       }
       return true;
    }
    

    public static void main(String[] args) {

        pallindrome LL = new pallindrome(); 
        LL.add(2);
        LL.add(1);
        LL.add(1);
        LL.add(2);
        
        LL.print();
        System.out.println(LL.Pallindrome());

        

        

        
    }
    
}

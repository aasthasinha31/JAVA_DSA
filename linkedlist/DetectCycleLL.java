package linkedlist;

public class DetectCycleLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DetectCycleLL LL = new DetectCycleLL();

        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);

        LL.print();

        // Create a cycle: 5 -> 3
        tail.next = head.next.next;

        System.out.println("Cycle Present : " + LL.detectCycle());
    }
}

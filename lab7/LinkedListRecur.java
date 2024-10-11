class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
class LinkedListRecursivePrint {
    public static void printListRecursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printListRecursive(head.next);
    }
}
public class LinkedListRecur {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        long startTime = System.nanoTime();  
        System.out.print("Recursive Linked List: ");
        LinkedListRecursivePrint.printListRecursive(list.head);  
        long endTime = System.nanoTime(); 
        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (Recursive): " + timeTaken + " nanoseconds.");
    }
}

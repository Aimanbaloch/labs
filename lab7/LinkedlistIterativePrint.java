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
public class LinkedlistIterativePrint {
    public static void printListIterative(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        long startTime = System.nanoTime();  
        System.out.print("Iterative Linked List: ");
        printListIterative(list.head);
        long endTime = System.nanoTime();  
        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (Iterative): " + timeTaken + " nanoseconds.");
    }
}

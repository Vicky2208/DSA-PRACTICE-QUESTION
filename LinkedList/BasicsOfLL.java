package LinkedList;

public class BasicsOfLL {
    Node head;

    // Creation of Linked List
    class Node {
        String data;
        Node next;

        // Initialization of Linked list

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add Node in First Position

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Node in Last Position

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print our Linked List

    public void printLL() {
        if (head == null) {
            System.out.println("List is empty");
        }
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        BasicsOfLL list = new BasicsOfLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addFirst("again");
        list.addLast("linkedList");
        list.printLL();

    }

}

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

    // Add Node in First Position O(1)

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Node in Last Position O(n)

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

    // Add Node in Anywhere
    public void addAnyPosition(String data, String AddData) {
        Node NewNode = new Node(AddData);
        if (head == null && head.data == data) {
            addFirst(AddData);
            return;
        }
        Node currNode = head;
        while (currNode.data != data) {
            currNode = currNode.next;
        }
        NewNode.next = currNode.next;
        currNode.next = NewNode;

    }

    // Print our Linked List

    public void printLL() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null\n");
    }

    // Delete from start O(1)

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    // Delete from end O(n)

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;

        } else {
            Node currNode = head;
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            currNode.next = null;
        }

    }

    // Delete From Anywhere O(n)

    public void deleteFromAny(String data) {
        if (head.data == data) {
            deleteFromStart();

        } else {

            Node currNode = head;
            while (currNode.next.data != data) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;

        }
    }

    // Reverse A linked list (ITERATIVE APPROACH)

    // public void reverse() {
    // Node prev = head;
    // Node curr = head.next;

    // if (head == null || curr == null) {
    // System.out.println("List is empty or there is only one element");
    // return;
    // }

    // while (curr != null) {

    // Node nxt = curr.next;

    // curr.next = prev;
    // prev = curr;
    // curr = nxt;
    // }
    // head.next = null;
    // head = prev;

    // }
    // RECURSIVE APPROACH

    public Node reverse2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse2(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        BasicsOfLL list = new BasicsOfLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addFirst("again");
        list.addLast("linkedList");
        list.addLast("part");
        list.printLL();
        // list.deleteFromAny("part");
        // list.addAnyPosition("a", "type");
        // list.addAnyPosition("type", "of");
        // list.addAnyPosition("again", "Hii");
        // list.addAnyPosition("linkedList", "Program");
        // list.deleteFromEnd();
        // list.deleteFromEnd();
        list.addAnyPosition("again", "hello");
        list.printLL();
        list.reverse2(list.head);
        list.printLL();

    }

}

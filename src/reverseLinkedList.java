package src;

// Given pointer to the head node of a linked list,
// the task is to reverse the linked list. We need to
// reverse the list by changing the links between nodes.
class reverseLinkedList {

    static Node head;

    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println();
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
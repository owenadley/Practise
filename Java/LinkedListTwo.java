public class LinkedListTwo {

    Node head;

    static class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
            this.next = null;
        }
    }


    static void printList(Node node) {

        while (node != null) {

            System.out.println(node.value + " ");
            node = node.next;

        }

    }

    static Node reverseList(Node node) {

        Node current = node;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public static void main (String[] args) {

        LinkedListTwo list = new LinkedListTwo();
        list.head = new Node(45);
        list.head.next = new Node(50);
        list.head.next.next = new Node(65);
        Node newhead = reverseList(list.head);
        printList(newhead);
    }




}
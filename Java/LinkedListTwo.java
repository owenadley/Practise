public class LinkedListTwo {
    
    Node head;

    static class Node {

        Node next;
        int data;

        Node (int d) {
            this.next = null;
            this.data = d;
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static Node reverseList(Node node) {

        Node next;
        Node prev = null;
        Node current = node;

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
        list.head = new Node(25);
        list.head.next = new Node(50);
        list.head.next.next = new Node(33);
        list.head.next.next.next = new Node(78);

        list.head = reverseList(list.head);
        printList(list.head);



    }

    

}
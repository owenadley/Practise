import jdk.internal.jshell.tool.resources.l10n;

public class LinkedList {

    Node root;

    public class Node {
        int value;
        Node nextNode;

        public Node(int val) {
            this.value = val;
        }
    }

    // insert to the beginning of ll
    public void insertFront(int val) {
        Node newNode = new Node(val);
        newNode.nextNode = root;
        root = newNode;
    }

    // insert to the end of ll
    public void insertEnd(int val) {
        Node newNode = new Node(val);
        Node temp = root;
        Node prev = root;

        while(temp.nextNode != null) {
            prev = temp;
            temp = temp.nextNode;
        }

        prev.nextNode = newNode;
    }

    public void insertInOrder(int val) {

        Node newNode = new Node(val);
        Node prev = null;
        Node curr = root;

        if (root == null || newNode.value < root.value) {
            newNode.nextNode = root;
            root = newNode;
        } else {
            while(curr != null && newNode.value > curr.value) {
                prev = curr;
                curr = curr.nextNode;
            }
    
            prev.nextNode = newNode;
            newNode.nextNode = curr;
        }
    }

    // reverse the ll
    public void reverse() {

/*         Node curr = root;
        Node prev = null;
        Node next;

        while (curr!=null) {
            next = curr.nextNode;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
        this.root = prev; */

    }

    public boolean remove(int val) {

        Node curr = this.root;
        Node prev = null;
        while (curr != null) {

            if (curr.value == val) {

                if (prev == null) {
                    this.root = curr.nextNode;
                } else {
                    prev.nextNode = curr.nextNode;
                }
                return true;
            }

            prev = curr;
            curr = curr.nextNode;
        }

        return false;

    }

    public void splitList(int val) {

        Node curr = root;
        Node tail = root;

        while (curr != null) {

            Node next = curr.nextNode;

            if (curr.value > val) {
                tail.next = curr;
                tail = curr;
            } else {
                curr.next = root;
                root = curr;
            }
            curr = next;
        }
        tail.nextNode = null;

    }

    public void printList() {
        Node temp = root;
        System.out.println("*************");
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
        System.out.println("*************");       
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertFront(10);
        list.insertEnd(20);
        list.printList();
        //list.reverse();
        //list.printList();
        //list.remove(10);      
        list.insertInOrder(25);
        list.insertInOrder(5);  
        list.splitList(10);      
        list.printList();


    }


}
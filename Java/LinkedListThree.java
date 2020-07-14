import java.util.*;

public class LinkedListThree {

    static Node root;


    public class Node {

        Node nextNode;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertFront(int val) {
        Node newNode = new Node(val);
        newNode.nextNode = root;
        root = newNode;
    }
    public void insertEnd(int val) {
        Node newNode = new Node(val);
        Node temp = root;
        Node prev = null;

        while(temp != null) {
            prev = temp;
            temp = temp.nextNode;
        }
        prev.nextNode = newNode;
        
    }


    public boolean remove(int val) {
        Node temp = root;
        Node prev = null;

        while (temp != null) {
            if (temp.value == val) {
                if (prev == null) {
                    root = root.nextNode;
                } else {
                    prev.nextNode = temp.nextNode;
                }
                return true;
            }
            prev = temp;
            temp = temp.nextNode;
        }
        return false;
    }

    public void split (int val) {

        Node tail = root;
        Node curr = root;
        
        while (curr != null) { 
            Node next = curr.nextNode;
            if (curr.value < val) {
                curr.nextNode = root;
                root = curr;
            } else {
                tail.nextNode = curr;
                tail = curr;
            }
            curr = next;
        }
        tail.nextNode = null;
        
    }

    public boolean hasCycle() {
        Hashtable<Integer, Node> ht = new Hashtable<Integer, Node>();

        Node curr = root;
        while (curr != null) {
            System.out.println(curr.value);

            if (ht.containsKey(curr.value)) {
                return true;
            }

            ht.put(curr.value, curr);
            curr = curr.nextNode;
        }
        return false;
    }

    public static Node findMiddle() {

        Node fp = root;
        Node sp = root;

        while (fp != null && fp.nextNode != null) {
            fp = fp.nextNode.nextNode;
            sp = sp.nextNode;
        }

        return sp;
        
    }

    public void printList() {
        Node temp = root;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }

    }

    public static void main(String[] args) {
        LinkedListThree list = new LinkedListThree();
        list.insertFront(50);
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        //list.remove(10);
        //list.printList();

        //list.split(25);
        list.printList();
        System.out.println(list.hasCycle());
        Node middle = findMiddle();
        System.out.println(middle.value);
        
    }


}
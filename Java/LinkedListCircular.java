import java.util.*;
import java.util.Hashtable;
public class LinkedListCircular {
    
    Node root;
    Node last;

    public class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFront(int val) {

        Node newNode = new Node(val);

        if (last == null) {
            last = newNode;
            root = newNode;
        } else {
            newNode.nextNode = root;
            root = newNode;
        }

        last.nextNode = root;
    }

    public boolean remove(int val) {

        Node temp = root;
        Node prev = null;

        do {
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
        } while (temp != last.nextNode);

        return false;
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

    public void printList() {
        Node temp = root;        

        do {
            System.out.println(temp.value);
            temp = temp.nextNode;
        } while ((temp != last.nextNode));
    }


    public static void main (String[] args) {

        LinkedListCircular list = new LinkedListCircular();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);
       // list.printList();

        System.out.println(list.hasCycle());
    }

}
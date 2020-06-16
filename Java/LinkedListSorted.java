public class LinkedListSorted {
    
    Node root;

    public class Node {

        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        Node temp = root;
        Node prev = null;

        if (root == null || newNode.value < root.value) {
            newNode.nextNode = root;
            root = newNode;
        } else {

            while (temp != null && newNode.value > temp.value) {
                prev = temp;
                temp = temp.nextNode;
            }

            newNode.nextNode = prev.nextNode;
            prev.nextNode = newNode;
        }
    }

    public boolean remove(int val) {

        Node prev = null;
        Node temp = root;

        while (temp != null) {

            if (temp.value == val) {
                prev.nextNode = temp.nextNode;
                return true;
            }

            prev = temp;
            temp = temp.nextNode;
        }

        return false;

    }

    public void printList() {
        Node temp = root;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        } 
    }


    public static void main (String[] args) {

        LinkedListSorted list = new LinkedListSorted();
        list.insert(10);
        list.insert(30);
        list.insert(20);
        list.insert(20);  
        list.insert(50);  
        list.insert(2);
        list.remove(30);
        list.printList();

    }

}
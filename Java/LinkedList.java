 public class LinkedList {
    
    // LinkedList operations:
    // getSize()
    // find(data)
    // add(data)
    // remove(data)

    int size;
    Node root;

    public LinkedList() {
        this.size = 0;
        this.root = new Node();
    }

    void setSize(int i) {
        this.size = i;
    }
    int getSize() {
        return this.size;
    }

    Node add(int value) {
        Node newNode = new Node(value, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    Node find(int value) {
        Node current = this.root;

        while (current != null) {
            if (current.getData() == value) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
    }
    boolean remove(int value) {
        Node current = this.root;
        Node prevNode = null;

        while (current != null) {

            if (current.getData() == value) {
                if (prevNode != null) {
                     prevNode.setNextNode(current.getNextNode());
                } else {
                    this.root = current.getNextNode();
                    current = null;
                }
                this.size = this.getSize() - 1;
                return true;
            }
            prevNode = current;
            current = current.getNextNode();

        }
        return true;
    }


    void printList(Node head) {
        Node current = head;
        while (current != null) {

            System.out.println(current.value + " ");
            current = current.getNextNode();
        }
    }

    Node reverseList() {

        Node current = root;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;
        }
        //System.out.println(prev.getNextNode().getNextNode().getData());
        return prev;
    }

    static class Node {

        Node nextNode;
        int value;

        Node() {}
        Node(int val) {
            this.value = val;
        }
        Node(int val, Node nextNode) {
            this.nextNode = nextNode;
            this.value = val;
        }

        void setData(int val) {
            this.value = val;
        }

        int getData() {
            return this.value;
        }

        void setNextNode(Node n) {
            this.nextNode = n;
        }

        Node getNextNode() {
            return this.nextNode;
        }

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        //ll.add(8);
        ll.add(10);
        ll.add(15);
        ll.add(12);
        //System.out.println(ll.getSize());
        //ll.remove(10);
        //System.out.println(ll.getSize());
        //System.out.println(ll.find(8));
        ll.printList(ll.root);
        //System.out.println("Size " + ll.getSize());
        Node newhead = ll.reverseList();      
        ll.printList(newhead);

    }

} 



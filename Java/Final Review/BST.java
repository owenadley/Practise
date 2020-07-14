import java.util.*;

public class BST {
    
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
            this.right = null;
            this.left = null;
        }
    }

    public void insert(Node root, int val) {

        if (val > root.value) {

            if (root.right == null) {
                root.right = new Node(val);
            } else {
                insert(root.right, val);
            }

        } else {

            if (root.left == null) {
                root.left = new Node(val);
            } else {
                insert(root.left, val);
            }

        }
    }

    public void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.value);
            printInOrder(root.right);
        }
    }

    public void printPreOrder(Node root) {
        if (root != null) {
            System.out.println(root.value);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public void printPostOrder(Node root) {
        if (root != null) {
            printPreOrder(root.left);
            printPreOrder(root.right);
            System.out.println(root.value);            
        }
    }

    public void dfsNonRecursive(Node root) {
        
        Stack<Node> s = new Stack();
        s.push(root);

        while (!s.isEmpty()) {

            Node node = s.pop();
            System.out.println(node.value);

            if (node.right != null) {
                s.add(node.right);
            }
            if (node.left != null) {
                s.add(node.left);
            }
        }
    }
    
    public void dfsNonRecursiveInorder(Node root) {

            Stack<Node> stack = new Stack();

            while (!stack.isEmpty()) {

                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }

                root = stack.pop();
                System.out.println(root.value);
                root = root.right;

            }
    }

    public void bfs(Node root) {

    Queue<Node> q = new LinkedList<>();
    q.add(root);

        while (!q.isEmpty()) {

            Node node = q.remove();
            System.out.println(node.value);

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
    }

    public static void main (String[] args) {

        BST bst = new BST();
        Node root = new Node(10);
        bst.insert(root, 5);
        bst.insert(root, 20);
        bst.insert(root, 7);
        bst.insert(root, 25);
        bst.insert(root, 3);
        bst.insert(root, 8);
        bst.dfsNonRecursive(root);
    }

}


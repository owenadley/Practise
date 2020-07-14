import java.util.*;

public class BSTTwo {

    static class Node {
        Node left, right;
        int value;

        Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public void insert(Node root, int value) {

        if (value > root.value) {

            if (root.right == null) {
                root.right = new Node(value);
            } else {
                insert(root.right, value);
            }

        } else {

            if (root.left == null) {
                root.left = new Node(value);
            } else {
                insert(root.left, value);
            }

        }

    }

    public void printInOrderNR(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<Node>();

        Node curr = root;
        
        while(curr != null || s.size() > 0) {

            while(curr != null) {

                s.push(curr);
                curr = curr.left;
            }

            
            curr = s.pop();
            System.out.println(curr.value);

            curr = curr.right;

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

    public void printBfs(Node root) {

        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            System.out.println(curr.value);

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }

    }

    public static void main(String[] args) {

        BSTTwo bst = new BSTTwo();
        Node root = new Node(10);

        bst.insert(root, 20);
        bst.insert(root, 30);
        bst.insert(root, 6);
        bst.insert(root, 15);
        bst.insert(root, 8);

        bst.printInOrderNR(root);

    }

}
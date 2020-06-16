import java.util.*;

// BST is a type of binary tree where the left child has a value less than the parent and right child has a value greater than parent
// Searching: O(n) worst
// Delete: O(n) worst
// Insert: O(n) worst

// Other common trees:
//  AVL Tree: BST with an additional rule that the difference between the left and right subtree cannot be more than one.
//  Searching: O(logn) worst
//  Delete: O(logn) worst
//  Insert: O(logn) worst

public class BST {
    static class Node {
        Node left, right;
        int value;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (node.value > value) {
            // insert left
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new Node(value);
            }
        }
    }

    // iterate left subtree, root, rightsubtree
    // hence, "In Order Traversal"
    public static void dfsInOrder(Node node) {
        if (node != null) {
            dfsInOrder(node.left);
            System.out.println(" " + node.value);
            dfsInOrder(node.right);
        }
    }

    // iterate root, left, right
    // hence, "Pre Order Traversal"
    public static void dfsPreOrder(Node node) {
        if (node != null) {
            System.out.println(" " + node.value);
            dfsPreOrder(node.left);
            dfsPreOrder(node.right);
        }
    }

    // iterate left, right, root
    // hence, "Post Order Traversal"
    public static void dfsPostOrder(Node node) {
        if (node != null) {
            dfsPostOrder(node.left);
            dfsPostOrder(node.right);
            System.out.println(" " + node.value);            
        }
    }    

    public static void bfs(Node root) {
        
        if (root == null) {
            return;
        }

        Queue<Node> q = new java.util.LinkedList<>();
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
        Node root = new Node(5);
        bst.insert(root, 2);
        bst.insert(root, 6);
        bst.insert(root, 8);
        bst.insert(root, 1);
        bst.insert(root, 4);

        System.out.println("DFS In Order: ");
        dfsInOrder(root);    
        System.out.println("DFS Pre Order: ");        
        dfsPreOrder(root);    
        System.out.println("DFS Post Order: ");                            
        dfsPostOrder(root);    

        System.out.println("BFS: ");
        bfs(root); 
    }
}
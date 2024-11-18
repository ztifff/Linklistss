package bst;

public class BST {
	Node root;

    // Method to insert a key into the BST
    public void insert(int key) {
        root = insertRecursively(root, key);
    }

    // Helper method to insert a key recursively
    private Node insertRecursively(Node node, int key) {
        if (node == null) {
            return new Node(key); // Create a new node when reaching a null position
        }

        if (key < node.key) {
            node.left = insertRecursively(node.left, key); // Insert into left subtree
        } else if (key > node.key) {
            node.right = insertRecursively(node.right, key); // Insert into right subtree
        }

        return node; // Return the unchanged node pointer
    }

    // Method to search for a key in the BST
    public boolean search(int key) {
        return searchRecursively(root, key);
    }

    // Helper method to search for a key recursively
    private boolean searchRecursively(Node node, int key) {
        if (node == null) {
            return false; // Key not found
        }

        if (node.key == key) {
            return true; // Key found
        }

        if (key < node.key) {
            return searchRecursively(node.left, key); // Search in left subtree
        } else {
            return searchRecursively(node.right, key); // Search in right subtree
        }
    }

    // In-order Traversal (for debugging/visualization)
    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.key + " ");
        inOrderTraversal(node.right);
    }

}

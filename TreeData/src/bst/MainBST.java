package bst;
import java.util.Scanner;
public class MainBST {
	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();

        System.out.print("Enter the number of nodes to insert: ");
        int size = scanner.nextInt();

        // Insert nodes into the BST
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            tree.insert(value);
        }

        // Display the BST in in-order traversal
        System.out.println("In-order Traversal of the Binary Search Tree:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // Search for a value in the BST
        System.out.print("Enter a value to search: ");
        int searchValue = scanner.nextInt();
        if (tree.search(searchValue)) {
            System.out.println(searchValue + " is found in the tree.");
        } else {
            System.out.println(searchValue + " is not found in the tree.");
        }
    }

	}



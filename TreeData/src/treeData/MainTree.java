package treeData;

import java.util.Scanner;

public class MainTree {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		
		System.out.print("Enter size of the tree: ");
		int size = scanner.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number: ");
			int key = scanner.nextInt();
			tree.insert(key);
		}
		
		System.out.println("Traversal in In Order:");
		tree.inOrderTraverse(tree.root);
		System.out.println("\n");
		System.out.println("Traversal in Pre Order:");
		tree.preOrderTraverse(tree.root);
		System.out.println("\n");
		System.out.println("Traversal in Post Order:");
		tree.postOrderTraverse(tree.root);
		

	}

}

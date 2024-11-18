package treeData;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	Node root;
	
	
	public void insert(int key) {
		if (root == null) {
			root = new Node(key);
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node current = queue.peek();
			queue.remove();
			
			if (current.left == null) {
				current.setLeft(new Node(key));
				 break;
			} else {
				queue.add(current.left);
			}
			if (current.right == null) {
				current.setRight(new Node(key) );
				 break;
			} else {
				queue.add(current.right);
			}
		}
	}
	
	public void inOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraverse(node.left);
		System.out.print(node.key + " ");
		
		inOrderTraverse(node.right);
	}
	
	public void preOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	public void postOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.print(node.key + " ");
	}
	

}

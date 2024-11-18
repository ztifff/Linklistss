package treeData;

public class Node {
	
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key = key;
		this.left = null;
        this.right = null;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}

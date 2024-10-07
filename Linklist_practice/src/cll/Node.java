package cll;

public class Node {
	
	int data;
	Node nextNode;
	
	public Node() {
		data = 0;
		nextNode = null;
	}
	public Node(int data) {
		this.data = data;
		nextNode = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data =data;
	}
	public Node getNext() {
		return nextNode;
	}
	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}

}

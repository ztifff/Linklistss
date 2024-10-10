package doubly;

public class Node {
	
	int data;
	Node nextNode;
	Node prevNode;
	
	public Node() {
		nextNode=null;
		data =0;
		prevNode=null;
	
	}
	public Node(int data) {
		this.data = data;
		nextNode=null;
		prevNode=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return nextNode;
	}
	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPrev() {
		return prevNode;
	}
	public void setPrev(Node prevNode) {
		this.prevNode = prevNode;
	}

}

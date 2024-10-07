package singly;

public class Linklists {
	
	Node headNode;
	
	public void add(Node node) {
		if (headNode == null) {
			headNode = node;
		} else {
			Node temNode = headNode;
			while (temNode.nextNode != null) {
				temNode = temNode.nextNode;
			}
			temNode.setNext(node);
			
		}
		
	}
	
	public void display() {
		Node temNode = headNode;
		int position = 0;
		int length = 0;
		while (temNode != null) {
			System.out.println("Node " + position + ": " + temNode.data);
			temNode =temNode.nextNode;
			position++;
			length++;
		}
		System.out.println("The length is " + length);
	}
	
	public void insert(Node newnNode, int position) {
		
		if (position == 0) {
			newnNode.setNext(headNode);
			headNode = newnNode;
			return;
		} 
		
		Node temNode = headNode;
		int index = 0;
		while (temNode != null && index < position -1) {
			temNode = temNode.getNext();
			index++;
		}
		
		newnNode.setNext(temNode.nextNode);
		temNode.setNext(newnNode);
	}
	public void delete(int position) {
		
		if (position == 0) {
			headNode = headNode.nextNode;
		}
		
		Node tempNode = headNode;
		int index = 0;
		
		while (tempNode != null && index < position -1) {
			tempNode = tempNode.nextNode;
			index++;
		}
		
		tempNode.setNext(tempNode.nextNode.nextNode);
		tempNode = tempNode.getNext();
		
	}

}

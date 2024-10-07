package doubly;

public class Linklist {
	
	Node headNode;
	Node tailNode;
	
	public void add(Node node) {
		if (headNode == null) {
			headNode = node;
		} else {
			Node tempNode = headNode;
			while (tempNode.nextNode!= null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.setNext(node);
			node.setPrev(tempNode);
		}
	}
	//single
	public void deleteHead() {
		Node temNode = headNode;
		if (temNode != null) {
			headNode = headNode.nextNode;
		}
		if (temNode != null) {
			 headNode.setPrev(null);
		}
	}
	
	public void bago1(Node newnNode) {
		
		newnNode.nextNode = headNode;
//		headNode.prevNode = newnNode;
//		newnNode.prevNode = null;
		headNode = newnNode;
		
	}
	public void bago2(Node newnNode, int index) {
		
		Node temNode = headNode;
		int position = 0;
		
		
			while (temNode != null && position < index -1) {
				temNode = temNode.nextNode;
				position++;
			}
			if (temNode == null) {
		        System.out.println("Index out of bounds.");
		        return;
		    }
			
		newnNode.setNext(temNode.nextNode);
		temNode.setNext(newnNode);
		
		if (temNode.getNext() != null) {
	        temNode.getNext().setPrev(newnNode);
	    }
		
		temNode.setNext(newnNode);
		
//		newnNode.nextNode = headNode.nextNode.nextNode.nextNode;
//		headNode.prevNode = newnNode;
//		newnNode.prevNode = headNode;
//		headNode.nextNode.nextNode.nextNode = newnNode;
		
		
	}
	
	
	public void display() {
		System.out.println("The values are: ");
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.nextNode;
		}
		
	}
	
	public void reverse() {
		System.out.println("The reverse values are: ");
		Node tempNode = headNode;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.prevNode;
		}
	}

}

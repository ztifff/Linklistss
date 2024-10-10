package cll;

public class Cll {
	
	Node headNode;
	
	public void add(Node node) {
		if (headNode == null) {
			headNode = node;
			headNode.setNext(headNode);
		} else {
			Node temNode = headNode;
			while (temNode.nextNode != headNode) {
				temNode = temNode.nextNode;
			}
			temNode.setNext(node);
			node.setNext(headNode);
		}
	}
	
	public void display() {
		Node temNode = headNode;
		int position = 0;
		int length = 0;
		do {
			System.out.println("Node " + position + ": " + temNode.data);
			temNode = temNode.nextNode;
			position++;
			length++;
		} while (temNode != headNode);
		System.out.print("The length is " + length);
		System.out.println();
	}
	
	public void insert(Node newnNode, int position) {
		
		  // Case 2: Inserting at position 0 in a non-empty list
		if (position == 0) {
			Node lastNode = headNode;
		
        // Traverse the list to find the last node
        while (lastNode.getNext() != headNode) {
            lastNode = lastNode.getNext();
        }
        
        // Insert the new node at the head
        newnNode.setNext(headNode);  // new node points to the current head
        lastNode.setNext(newnNode);  // last node points to the new head
        headNode = newnNode;         // new node becomes the head
        return;
		}
		Node tempNode = headNode;
	    int index = 0;

	    // Traverse to find the node before the desired position
	    while (index < position - 1 && tempNode.getNext() != headNode) {
	        tempNode = tempNode.getNext();
	        index++;
	    }
	    newnNode.setNext(tempNode.getNext());  // new node points to the next node
        tempNode.setNext(newnNode);  // previous node points to the new node
		
//		 newnNode.setNext(headNode);
//		 headNode = newnNode;
//		 headNode.setNext(newnNode);
//		 newnNode = headNode;
		
		
	}
	public void delete(int position) {
		
		
		if (position == 0) {
			Node lastNode = headNode;
			
			while (lastNode.nextNode != headNode) {
				lastNode = lastNode.nextNode;
			}
			
			headNode = headNode.getNext();
			lastNode.setNext(headNode);
			
			return;
		}
		
	}

}

package doubly;


public class Linklist {
	
	Node headNode;
	
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
	public void delete(int position) {
		
		if (position ==0) {
			headNode = headNode.nextNode;
		}
		if (position ==0) {
			 headNode.setPrev(null);
			 
		}
		Node temNode = headNode;
		int index = 0;
		
		while (temNode.nextNode != null && index < position -1) {
			temNode = temNode.nextNode;
			index++;
		}
		
		if (temNode.nextNode != null && temNode.prevNode != null) {
		    temNode.nextNode.setPrev(temNode.prevNode.prevNode);
		} else if (temNode.nextNode != null) {
		    temNode.nextNode.setPrev(null);
		}
		temNode = temNode.nextNode;
		
	}
	
	
	public void insert(Node newnNode, int position) {
		if (position == 0) {
			newnNode.nextNode = headNode;
			headNode.prevNode =newnNode;
			newnNode.prevNode = null;
			headNode = newnNode;
			return;
			
		}
		Node tempNode = headNode;
		int index = 0;
		
		
		
		while (tempNode.nextNode != null && index < position -1) {
			tempNode = tempNode.nextNode;
			index++;
		}
		
		if (tempNode.nextNode == null) {
			newnNode.nextNode = null;
			newnNode.prevNode = tempNode;
			tempNode.nextNode = newnNode;
			tempNode = newnNode;
			return;
		}
		
		newnNode.setNext(tempNode.nextNode);
		newnNode.setPrev(tempNode);
		tempNode.nextNode.setPrev(newnNode);
		tempNode.setNext(newnNode);
		
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
	
	public void average() {
		Node tempNode = headNode;
		int sum =0;
		int count = 0;
		while (tempNode != null) {
			int data = tempNode.data;
			sum += data;
			count++;
			tempNode = tempNode.nextNode;
		}
		Double averageDouble = (double) (sum / count);
		System.out.println("Total average " + averageDouble);
		
	}
	
	public int highest() {
		Node tempNode = headNode;
		int highest = Integer.MIN_VALUE;
		
		while (tempNode != null) {
			int data = tempNode.data;
			if (highest < data) {
				highest = data;
			}
			tempNode = tempNode.nextNode;
		}
		System.out.println("Highest Number: " + highest);
		return highest;
	}
	public void deleteHighest() {
		 int highest = highest(); // Get the highest value
		    Node tempNode = headNode; // Start from the head node

		    // Traverse the list to find the node to delete
		    while (tempNode != null) {
		        if (tempNode.getData() == highest) {
		            // If it's the first node
		            if (tempNode == headNode) {
		                headNode = tempNode.getNext(); // Move head to the next node
		                if (headNode != null) {
		                    headNode.setPrev(null); // Update the new head's prev to null
		                }
		            } else {
		                // Link previous node with the next node (skip current node)
		                Node prevNode = tempNode.getPrev();
		                Node nextNode = tempNode.getNext();
		                prevNode.setNext(nextNode);
		                if (nextNode != null) {
		                    nextNode.setPrev(prevNode); // Update the next node's prev link
		                }
		            }
		            System.out.println("After deleting highest:");
		            return;
		        }
		        tempNode = tempNode.getNext(); // Move to the next node
		    }
	}

}

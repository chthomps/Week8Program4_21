


// This class encapsulates an int value as a linked node

	public class LinkedNode {  //consists of two things
		int x;            // 1-The data value
		LinkedNode next;  // 2-Reference to the next LinkedNode
		
		// Default constructor
		LinkedNode() {
			next = null;
		}
		
		// Constructor that initializes the data value
		LinkedNode(int x) {
			this.x = x;
		}
		
}


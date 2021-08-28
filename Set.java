
public class Set {

	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Count tracks the number of nodes in the list

	// Constructor - initializes the front and count variables for the linked list
	Set() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	// ===========================================
	// Add values method
	// ===========================================

	public void addValue(String input, Set list) { // accepts user inputs as a string and the data (linkedList) as parameters

		String[] arrayIn = input.split(" "); // establish String array holding user inputs

		if (arrayIn.length < 2 || arrayIn[0].equals(" ")) {
			return; // return to menu if input is less than 2 terms or operator [0] is lacking
		}

		// Variables
		int add; // value user wants added to set
		add = Integer.parseInt(arrayIn[1]); // parse int from user input

		LinkedNode currentNode = list.front; // node tracker pointing to the first node of linkedList

		String found = null; // variable for locating existing string

		// unique value assessment
		for (int count = list.count; count >= 0; count--) { // scroll down set (arrayIn)
			if (count == 0) { // linkedList count- 1st user entry
				list.push(add);
				System.out.println(list);
				found = "true";
				break;

			} else if (currentNode.x == add) { // if number already exists in set- denotes "true"
				found = "true";
				System.out.println(list);
				break;

			} else {
				currentNode = currentNode.next; // otherwise, look at next node
				count--;
			}
		}
		if (found != "true") { // only add unique values to set
			list.push(add);
			System.out.println(list);

		}

	}

	// ===================================================
	// Delete values method
	// ===================================================

	public void deleteValue(String input, Set list) {

		String[] arrayIn = input.split(" "); // establish String array holding user inputs

		if (arrayIn.length < 2 || arrayIn[0].equals(" ")) {
			return; // return to menu if input is less than 2 terms or operator [0] is lacking
		}

		// Variables
		int del; // value user wants deleted from set
		del = Integer.parseInt(arrayIn[1]); // parse "del" from user input (user integer input resides at index 1)

		int targetCount = 0;
		LinkedNode currentNode = list.front; // node tracker pointing to the first node of linkedList

		// check if value to delete is in linkedList- return list printout otherwise
		while (currentNode.x != del) {
			if (currentNode.x != del) {
				currentNode = currentNode.next; // advance node tracker when input (del) is not found
				targetCount++; // stop counting at node of user-specified delete

				if (currentNode.next == null) { // reaching end of linkedList w/out finding del
					System.out.println(list);
					return;
				}
			}
		}

		LinkedNode homing = list.front;
		int count = 0;
		while (count < targetCount - 1) { // advance to proper node position
			homing = homing.next;
			count++;
		}

		// set node to null
		LinkedNode delete = homing.next;
		homing.next = delete.next;
		delete.next = null;

		System.out.println(list);

	}

	// ===========================================
	// Exists method
	// ===========================================

	public void existsValue(String input, Set list) {

		// Declare array
		String[] arrayIn = input.split(" ");

		// error check
		if (arrayIn.length < 2 || arrayIn[0].equals(" ")) {
			return;
		}

		// Variables
		String found = null;
		int numExists;
		numExists = Integer.parseInt(arrayIn[1]);
		LinkedNode currentNode = list.front;

		// Check for value- return "true" if found
		for (int count = list.count; count >= 0; count--) {
			if (currentNode.x == numExists) {
				found = "true";
				System.out.println("true");
				break;

			} else {
				currentNode = currentNode.next;
				count--;
			}
		}
		if (found != "true") {
			System.out.println("false");
		}

	}

}

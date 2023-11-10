package LinkedList;

public class LinkedList {

	node head;

	// To make the code more organised
	private class node {

		int data;
		node next;

		// Improve to make a abbreviation the lines in the code
		node(int data) {
			this.data = data;
		}
	}

	void insert(int value) {
		// Create node and insert data.
		node newNode = new node(value);

		if (head == null) {
			head = newNode;
		} else {
			node i = head;
			while (i.next != null) {
				i = i.next;
			}
			i.next = newNode;
		}
	}

//	void insert(int value, int position) {
//		// Create node and insert data.
//		node newNode = new node(value);
//
//		
//	}

	void remove(int position) {
		if (position == 0) {
			node oldNode = head;
			head = oldNode.next;
			oldNode.next = null;
		} else {
			node i = head;
			for (int j = 1; j < position; j++) {
				i = i.next;
			}
			node oldNode = i.next;
			i.next = oldNode.next;
			oldNode.next = null;

		}
	}

	int read(int position) {
		node i = head;
		for (int j = 0; j <= position; j++) {
			i = i.next;
		}

		return i.data;
	}
	
	void modify(int value, int position) {
		node i = head;
		for (int j = 0; j <= position; j++) {
			i = i.next;
		}
		i.data = value;
	}

	void print() {
		System.out.print("[ ");
		node i;
		i = head;
		while (i != null) {
			System.out.print(i.data + ", ");
			i = i.next;
		}
		System.out.print(" ]");
	}

}

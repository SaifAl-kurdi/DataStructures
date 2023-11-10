package Stack;

public class LinkedListStack {

	class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
		}
	}

	// Head == top
	node head;

	void push(int value) {
		node newNode = new node(value);
		if (isEmpty()) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}

	void pop() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		}

		if (head.next == null) {
			head = null;
		}

		else {
			node oldNode = head;
			head = oldNode.next;
			oldNode.next = null;
		}
	}

	int top() {
		return head.data;
	}

	boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
}

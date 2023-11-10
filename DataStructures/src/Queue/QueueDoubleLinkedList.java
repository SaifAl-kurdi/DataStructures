package Queue;

public class QueueDoubleLinkedList {
	private class node {
		int data;
		node next;
		node previous;

		node(int data) {
			this.data = data;
		}
	}

	node front;
	node rear;

	void enqueue(int value) {
		node newNode = new node(value);
		if (isEmpty()) {
			newNode.previous = null;
			newNode.next = null;
			front = newNode;
			rear = newNode;
		} else {
			newNode.next = rear;
			newNode.previous = null;
			rear.previous = newNode;
			rear = newNode;
		}
	}

	void dequeue() {
		if (isEmpty())
			throw new IllegalAccessError();
		if (rear.next == null) {
			rear = null;
			front = null;
		} else {
			node tail = front;
			front = front.previous;
			front.next = null;
			tail.previous = null;
		}
	}

	boolean isEmpty() {
		if (rear == null) {
			return true;
		} else {
			return false;
		}
	}

	int front() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		}
		return front.data;
	}

	int rear() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		}
		return rear.data;
	}
}
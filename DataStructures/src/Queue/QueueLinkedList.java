package Queue;

public class QueueLinkedList {

	private class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
		}
	}

	node front;
	node rear;

	void enqueue(int value) {
		node newNode = new node(value);
		
		if (isEmpty()) {
			 front = newNode;
			 rear = newNode;
		} else {
			 rear.next = newNode;
		}
	}

	void dequeue() {
		node oldNode = front;
		if (isEmpty()) {
			throw new IllegalAccessError();
		}

		if (front.next == null) {
			front = null;
		} else {
			front = front.next;
			front.next = oldNode;
		}
	}

	boolean isEmpty() {
		if (front == null) {
			return true;
		} else {
			return false;
		}
	}
	int front() {
		return front.data;
	}
}

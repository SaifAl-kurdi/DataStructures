package Queue;

public class QueueList {

	int size;
	int a[];
	int rear;
	int front;

	QueueList() {
		size = 2;
		a = new int[size];
		rear = -1;
		front = -1;
	}

	void enQueue(int value) {

		if((rear +1)%size == front) {
			throw new IllegalAccessError();
		}
		else if (isEmpty()) {
			rear++;
			front++;
			a[rear] = value;
		} else {
			rear=(rear+1)%size;
			a[rear] = value;
		}
	}

	void deQueue() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		} else if (rear == front) {
			front = rear = -1;
		} else {
			front=(front+1)%size;
		}
	}

	int front() {
		return a[front];
	}

	boolean isEmpty() {
		if (rear == -1 && front == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull() {
		if (rear == size - 1) {
			return true;
		} else {
			return false;
		}
	}
}

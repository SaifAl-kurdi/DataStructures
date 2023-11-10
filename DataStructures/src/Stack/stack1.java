package Stack;

public class stack1 {
	int maxSize;
	int []a;
	int top;

	public stack1() {
		maxSize = 3;
		a = new int[maxSize];
		top = -1;
	}

	void push(int value) {

		if (top + 1 == maxSize) {
			throw new IllegalAccessError();
		} else {
			top++;
			a[top] = value;
		}
	}

	void pop() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		}
		top--;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	int top() {
		return a[top];
	}
}

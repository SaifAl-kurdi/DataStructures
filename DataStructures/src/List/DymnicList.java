package List;

public class DymnicList {

	int maxSize;
	int[] a;
	int end;

	public DymnicList() {
		maxSize = 1;
		a = new int[maxSize];
		end = -1;
	}

	// O(n)
	void insert(int value) {
		// Just to check the array if full make a new array with double size
		if (end + 1 == maxSize) {
			maxSize = maxSize * 2;
			int b[] = new int[maxSize];

			for (int i = 0; i <= end; i++)
				b[i] = a[i];
			a = b; // Renaming
		}
		a[++end] = value;
	}

	// O(n)
	void insert(int value, int position) {
		// Just to check the array if full make a new array with double size
		if (end + 1 == maxSize) {
			maxSize = maxSize * 2;
			int b[] = new int[maxSize];
			for (int i = 0; i >= end; i++)
				b[i] = a[i];
			a = b;
		}

		// Shift right by one starting from end
		for (int i = end; i >= position; i--)
			a[i + 1] = a[i];
		a[position] = value;
		end++;
	}
	// O(n)
	void remove(int position) {
		for (int i = position; i < end; i++)
			a[i] = a[i + 1];
		end--;
	}
	// O(1)
	int count() {
		return end + 1;
	}

	// O(1)
	int read(int psition) {
		return a[psition];
	}

	// O(1)
	void modefy(int newValue, int position) {
		a[position] = newValue;
	}

	void print() {
		System.out.print("[ ");

		for (int i = 0; i <= end; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(" ]");
	}
}

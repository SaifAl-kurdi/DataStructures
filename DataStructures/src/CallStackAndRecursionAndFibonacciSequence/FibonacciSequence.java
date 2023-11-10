package CallStackAndRecursionAndFibonacciSequence;

public class FibonacciSequence {
	public static void main(String[] args) {

		System.out.println(a(50));


	}

	static int f(int n) {
		if (n <= 1) {
			return n;
		} else {
			int f1 = 0, f2 = 1, f = 0;

			for (int i = 2; i <= n; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
			return f;
		}
	}
	//Recursion
	static int a(int n) {
		if (n <= 1) {
			return n;
		}

		return f(n - 1) + f(n - 2);
	}

}

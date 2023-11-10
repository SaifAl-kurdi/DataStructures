package CallStackAndRecursionAndFibonacciSequence;

public class Factorial {

	public static void main(String[] args) {
		int x = 4;
		int a = fact(x);
		System.out.println(a);
	}

	static int fact(int y) {

		if (y == 0) {
			return 1;
		}
		return y * fact(y - 1);

	}

}

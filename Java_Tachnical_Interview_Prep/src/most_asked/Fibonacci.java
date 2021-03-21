package most_asked;

public class Fibonacci {
	public static void main(String[] args) {
		// Fibonacci ==> The Fibonacci Sequence is the series of numbers
		// which is founded by adding up to next numbers
		// EX: 10-->0 +1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 +55;

		// printing the sequences only:
		int a = 0, b = 1;

		System.out.print(a + " " + b + " ");

		for (int i = 2; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			
		
		}
		System.out.println("\n++++++++++++++++++++++++++++++++");
		System.out.println(sumOfFibo(10));
	}

	// printing sum of the fibonacci sequence

	public static int sumOfFibo(int num) {

		if (num <= 1)
			return num;
		return sumOfFibo(num - 1) + sumOfFibo(num - 2);

	}

}

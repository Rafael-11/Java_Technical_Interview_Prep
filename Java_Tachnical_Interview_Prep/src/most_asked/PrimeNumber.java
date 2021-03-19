package most_asked;

public class PrimeNumber {
	public static void main(String[] args) {
		// Check if the integer is prime or not

		System.out.println(isPrime(7));

	}

	public static boolean isPrime(int num) {

		// prime is should be greater than 1
		if (num <= 1) {
			return false;
		}
        //prime number can be divided by itself 
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}

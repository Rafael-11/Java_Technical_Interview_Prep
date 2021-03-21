package most_asked;

public class ArmStrong {
	public static void main(String[] args) {
		// write a function to check if the number is arm strong number or not
		// EX: 153 ==> 1*1*1 5*5*5 3*3*3
		// 1 + 125 + 27
		// sum= 153 If the sum is equal to original input
		// number this will be the arm strong number
		// 157==> 1*1*1 5*5*5 7*7*7
		// 1 + 125 + 21 = 147 So, it is not arm strong number
		// 157 != 147

		System.out.println(checkArmStrong(157));
		System.out.println(checkArmStrong(153));
	}

	public static boolean checkArmStrong(int num) {

		int temp = num;
		int total = 0, remainder;

		while (num > 0) {
			remainder = num % 10; // 3
			num = num / 10; // 15
			total += remainder * remainder * remainder;
		}

		return temp == total;
	}

}

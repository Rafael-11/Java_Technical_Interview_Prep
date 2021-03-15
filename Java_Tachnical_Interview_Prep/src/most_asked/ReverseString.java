package most_asked;

public class ReverseString {
	// write a function to reverse a string
	public static void main(String[] args) {

		System.out.println(rev("Java"));

	}

	public static String rev(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		return reversed;
	}

}

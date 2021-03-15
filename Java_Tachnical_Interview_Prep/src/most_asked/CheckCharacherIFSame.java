package most_asked;

import java.util.Arrays;

import java.util.TreeSet;

public class CheckCharacherIFSame {
	public static void main(String[] args) {
		// write a method that check if a string is build out of the same letters as
		// another string
		// EX: Same("abc","cba"); => true
		// Same("abc","cbd"); => false
		
		System.out.println(same("abc", "cba"));
		

	}

	// create same method with boolean return type accept 2 strings a and b
	// solution 1
	public static boolean same(String a, String b) {
		// converting string to char
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		// sort the array
		Arrays.sort(c1);
		Arrays.sort(c2);
		// create a empty string
		String a1 = "", b1 = "";

		for (char each : c1) {
			a1 += each;
		}
		for (char each : c2) {
			b1 += each;
		}

		return a1.equals(b1);
	}
	//solution 2
	public static boolean Same(String str1, String str2) {
		str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( ); 
		str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
		return str1.equals(str2);
	}
}
package most_asked;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDublicates {
	public static void main(String[] args) {
		// write a return method that can remove the duplicated values from string
		// EX: removeDup("AAAGSGBBGHF")=AGSBH

		System.out.println(removeDup("AAAGSGBBGH"));
		System.out.println(remove("AAAGSGBBGH"));

	}

	// sulution 1
	public static String removeDup(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains("" + str.charAt(i))) {
				result += "" + str.charAt(i);
			}
		}

		return result;

	}

	// solution 2
	public static String remove(String s) {

		s = new LinkedHashSet<String>(Arrays.asList(s.split(""))).toString();
		s = s.replace(",", "").replace("[", "").replace("]", "");
		return s;
	}
}

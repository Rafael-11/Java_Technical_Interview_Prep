package most_asked;

public class findUniqueCharacters {
	public static void main(String[] args) {

		// Ex: unique("AAABBBCCCDEF")==> DEF
		System.out.println(unique("AAABBBCCCDEF"));
	}

	public static String unique(String s) {

		String[] arr = s.split("");
		String uniqueValue = "";

		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(arr[i])) {
					num++;
				}
			}
			if (num == 1) {
				uniqueValue += arr[i];
			}
		}

		return uniqueValue;

	}

}

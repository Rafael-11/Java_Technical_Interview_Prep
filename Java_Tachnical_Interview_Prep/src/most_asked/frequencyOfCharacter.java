package most_asked;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacter {
	public static void main(String[] args) {
		/*
		 * Return the frequency of each character in the given string Ex: Input:
		 * DDDAACCCCCCB Output: D3A2C6B1
		 */
		
		/*
		Create a HashMap
	    For every character, Get the value from the hashmap 
	    -If the value is null, enter 1 -else, replace the value with (value+1)
	    Iterate over the HashMap and keep concatenating (Value+Key)
		 */

		System.out.println(frequencyOfChar("DDDAACCCCCCB"));

	}

	public static String frequencyOfChar(String str) {
		Map<String, Integer> map = new HashMap<>();
		for (String each : str.split("")) {
			if (map.containsKey(each)) {
				map.put(each, map.get(each) + 1);
			} else {
				map.put(each, 1);
			}
		}
		str = "";
		for (Map.Entry<String, Integer> each : map.entrySet()) {
			str +=each.getValue()+each.getKey();
		}
		return str;
	}

}

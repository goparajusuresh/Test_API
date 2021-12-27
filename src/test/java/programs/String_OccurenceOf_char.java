package programs;

import java.util.HashMap;

public class String_OccurenceOf_char {

	public static void main(String args[]) {

		String s1 = "PacteraEdge";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] strArray = s1.toCharArray();

		for (char c : strArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		System.out.println("Duplicate characters are:" + map);
	}
}
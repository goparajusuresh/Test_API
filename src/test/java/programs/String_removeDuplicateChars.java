package programs;

import java.util.LinkedHashSet;
import java.util.Set;
//Remove duplicate characters in a string
public class String_removeDuplicateChars {

	public static void main(String[] args) {

		String s1 = "Hello";
		char[] str = s1.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();

		for (char c : str) {
			set.add(c);

		}
		System.out.println(set);
		StringBuilder sb = new StringBuilder();
		for (Character ch : set) {
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}

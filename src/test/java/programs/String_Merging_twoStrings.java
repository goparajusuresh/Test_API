package programs;
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
//starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

public class String_Merging_twoStrings {

	public static void main(String[] args) {

		String s1 = "abcdefghijklmno";
		String s2 = "pqrrstuvwxyz";

		StringBuilder build = new StringBuilder();

		for (int i = 0; i < s1.length() || i < s2.length(); i++) {
			if (i < s1.length())
				build.append(s1.charAt(i));

			if (i < s2.length())
				build.append(s2.charAt(i));
		}
		System.out.println(build.toString());
	}
}

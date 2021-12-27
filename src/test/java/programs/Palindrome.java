package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		String str = s1.nextLine();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("the given number is palindrom");
		} else
			System.out.println("not a palindrome");

	}
}


/*
  Scanner s = new Scanner(System.in); 
  int number = s.nextInt(); int n = number;
  int reminder = 0; int temp = 0;
   while (number > 0) {
    reminder = number % 10;
  number = reminder /10; 
  temp = temp *10 + reminder; }
   if(temp == n) {
  System.out.println("The given number is Palindrom"); }
  else {
  System.out.println("not a palindrome number"); }
 */
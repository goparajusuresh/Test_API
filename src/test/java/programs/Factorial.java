package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		int fact = 1;
		for(int i=1; i<=number; i++) {
			fact = fact * i;			
		}
		System.out.println(fact);
		
	}

}

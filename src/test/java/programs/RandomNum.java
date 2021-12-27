package programs;

import java.util.Arrays;
import java.util.Random;

import com.mongodb.client.model.Sorts;

public class RandomNum {

	public static void main(String[] args) {
		int s1 = 0;
		Random random = new Random();
		// To print Random number
		for (int j = 0; j < 10; j++) {
			s1 = random.nextInt(999);
			System.out.println(s1);

		}
		String temp = Integer.toString(s1);

		//To sort random number
		int[] newGuess = new int[temp.length()];
		System.out.println("Print after sorting");
		Arrays.sort(newGuess);
		for (int i = 0; i < newGuess.length - 1; i++) {
			for (int j = i + 1; j < newGuess.length; j++) {
				if (newGuess[i] > newGuess[j]) {
					int temp1 = newGuess[i];
					newGuess[i] = newGuess[j];
					newGuess[j] = temp1;
				}
			}
		}
	}
}

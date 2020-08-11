package practice.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Input {
	
	protected static long getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value between 1 and 40: ");

		long userInput = 0;

		try {
			userInput = scanner.nextLong();
			if (userInput < 1 || userInput > 40) {
				System.out.println("Invalid Value");
				userInput = getUserInput();
			}
		} catch (InputMismatchException e) { // if user input is not a value compatible with the intended data type
			System.out.println("Invalid Value");
			userInput = getUserInput();
		}
		scanner.close();
		return userInput;
	}
}

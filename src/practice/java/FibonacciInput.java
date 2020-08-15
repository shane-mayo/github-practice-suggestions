package practice.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Shane Mayo
 * Date: 8-11-2020
 * 
 * A class that implements the Input interface for both the IterativeFibonacci and RecursiveFibonacci classes.
 *
 */

public class FibonacciInput implements Input {

	
	public long getUserInput() {
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

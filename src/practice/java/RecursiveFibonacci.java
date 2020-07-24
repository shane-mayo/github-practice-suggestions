package practice.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Shane Mayo
 * Date: 7-24-2020
 * 
 * Recursive Fibonacci
 * 
 * A recursive program for determining the Fibonacci sequence up to an Nth digit based on user input. The 
 * parameters for the program to remain ideally functional is between 1 and 40. Anything less than 1 or greater than 40 
 * will lead to a request for the user to enter a number within those parameters. The program will display the 
 * Fibonacci sequence up to the Nth digit in the console or terminal. The output is split into rows with 10 columns across.
 * 
 * It should be noted that this program is not streamlined in anyway, making user input parameters necessary. Streamlining 
 * will be done in the future.
 */

public class RecursiveFibonacci {

	public RecursiveFibonacci() {
		
		long userInput = getUserInput();
		
		for (int i = 0; i < userInput; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%-10d", computeFibonacci(i));
		}
	}

	/**
	 * computeFibonacci does the computational work of the program.
	 * @param userInput long representing the user input.
	 * @return the computed Fibonacci number for the current iteration.
	 */
	private long computeFibonacci(long i) {
		if (i <= 1) {
			return i;
		}
		
		return computeFibonacci(i - 1) + computeFibonacci(i - 2);
	}

	/**
	 * getUserInput attempts to retrieve input from the user, checking that the input falls within specified parameters
	 * @return long userInput
	 */
	private long getUserInput() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between 1 and 40: ");
		
		long userInput = 0;
		
		try {
			userInput = scanner.nextLong();
			
			if (userInput < 1 || userInput > 40) {  // check that the input falls within the specified parameters
				System.out.println("Number is less than 1 or greater than 40.");
				userInput = getUserInput();
			}
		} catch (InputMismatchException e) {  // in the event the user inputs a non-number; inform and continue
			System.out.println("Input not a number.");
			userInput = getUserInput();
		}
		scanner.close();
		
		return userInput;
		
	}
}

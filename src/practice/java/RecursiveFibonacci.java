package practice.java;

/**
 * 
 * @author Shane Mayo
 * Date: 7-24-2020
 * 
 * Recursive Fibonacci
 * 
 * A recursive program for determining the Fibonacci sequence up to an Nth digit based on user input. The 
 * parameters for the program to remain ideally functional is between 1 and 40. Anything less than 1 or greater than 40 
 * will lead to a request for the user to enter a number within those parameters. If interested in attempting larger 
 * inputs, simply comment out the specified line. The program, when executed, will display the 
 * Fibonacci sequence up to the Nth digit in the console or terminal.
 * 
 * It should be noted that this program is not streamlined in anyway, making user input parameters necessary. Streamlining 
 * will be done in the future.
 */

public class RecursiveFibonacci {

	public RecursiveFibonacci() {
		
		long userInput = Input.getUserInput();
		
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
	 * getUserInput allows the user to input a number between 1 and 40, checking the value to ensure that it falls within
	 * the specified parameters
	 * @return long userInput
	 */
//	

	
	public static void main(String[] args) {
		new RecursiveFibonacci();
	}
}

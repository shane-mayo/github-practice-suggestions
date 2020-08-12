package practice.java;

/**
 * 
 * @author Shane Mayo
 * Data: 8-11-2020
 * 
 * An iterative version of the Fibonacci sequence. The program asks for input from the user within a range of 1 to 40,
 * then prints out number of the Fibonacci sequence up to the number the user entered. The iterative approach is 
 * much faster compared to the unoptimized recursive version, allowing for a larger amount of values to be computed.
 * However, I kept the input range the same between the two in an attempt to allow comparison in speed between the two.
 * 
 */

public class IterativeFibonacci {
	
	public IterativeFibonacci() {
		FibonacciInput input = new FibonacciInput();
		long userInput = input.getUserInput();
		long fibOne = 0;
		long fibTwo = 1;
		
		// each iteration adds the previous two terms together together, i.e. 0 1 1 2 3 5 8...
		for (int i = 0; i < userInput; i++) {
			if (i % 10 == 0) {  // insert a line break at every 10th value output
				System.out.println();
			}
			System.out.printf("%-10d", fibOne);
			long temp = fibOne;
			fibOne = fibTwo;
			fibTwo += temp;
		}
	}

	public static void main(String[] args) {
		new IterativeFibonacci();
	}
}

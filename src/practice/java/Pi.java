package practice.java;

import java.util.Scanner;

/**
 * Computes pi to the Nth digit provided by the user. Then outputs the
 * solution.
 * @author Shane
 */

public class Pi {
	
	public Pi() {
//		getUserInput();
//		System.out.printf("%.15f", Math.PI);
		leibnizFormula(1000000000);
	}
	
	/**
	 * 
	 */
	private void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 40");
		int userInput = scanner.nextInt();
//		getAnswer(userInput);
		
		scanner.close();
	}
	
	private void caculatePiToNth() {
		
	}
	
	private void getAnswer(int userInput) {
	}
	
	private void leibnizFormula(double userInput) {
		// gives the result of pi/4. result must be multipled by 4
		// formula = summation of (-1)^n/(2n + 1) where n=0 to infinity
		double sum = 0;
		int count = 0;
		while (count <= userInput) {
			sum = (sum + (Math.pow(-1, count))/((2*count)+1));
			count++;
		}
		double pi = sum * 4;
		System.out.printf("%.15f%n%.15f", pi, Math.PI);
	}
}

package practice.java;

import java.util.Scanner;

public class Fibonacci {
	// fibonnaci sequence
	public Fibonacci() {
		int userInput = getUserInput();
		int lineBreak = 0;
		for (long i = 0; i < userInput; i++) {
			if (lineBreak == 10) {
				System.out.println();
				lineBreak = 0;
			}
			System.out.printf("%-10d  ", computeFibonacci(i));
			lineBreak++;
		}
	}
	
	private long computeFibonacci(long n) {
		if (n <= 1) {
			return n;
		}
//		System.out.printf("%d %d ", n-2, n-1);
		return computeFibonacci(n-1) + computeFibonacci(n-2);
	}
	
	private int getUserInput() {
		int userInput;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers from Fibonacci sequence to produce: ");
		userInput = scanner.nextInt();
		
		scanner.close();
		
		return userInput;
	}
}

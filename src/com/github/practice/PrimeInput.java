package com.github.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeInput implements Input {

	public long getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value: ");

		int userInput = 0;
		boolean isValid = scanner.hasNextInt();
		try {
			if (isValid) {
				userInput = scanner.nextInt();
			} else {
				System.out.println("Invalid Value");
				scanner.next();
				getUserInput();
			}
		} catch (InputMismatchException e) { // if user input is not a value compatible with the intended data type
			System.out.println("Invalid Value");
			scanner.next();
			getUserInput();
		}
		scanner.close();
		return userInput;
	}

}

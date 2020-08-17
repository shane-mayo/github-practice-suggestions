package com.github.practice;

public class PrimeFactorization extends PrimeInput {

	public static boolean isPrime(long number) {
		if (number < 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeFactorization(long userInput) {

		String result = new String();
		long tempUserInput = userInput;

		for (long i = 2; i <= tempUserInput; i++) {
			if (isPrime(i)) {
				if (tempUserInput % i == 0) {
					if (tempUserInput / i == 1) {
						if (tempUserInput == userInput) {
							System.out.println(userInput + " is a prime number.");
							break;
						}
						result = result.concat(String.valueOf(i)) + " = " + String.valueOf(userInput);
						break;
					}
					result = result.concat(String.valueOf(i));
					tempUserInput = tempUserInput / i;
					i--;
					result = result.concat(" * ");
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		PrimeInput userInput = new PrimeInput();
		primeFactorization(userInput.getUserInput());
	}
}

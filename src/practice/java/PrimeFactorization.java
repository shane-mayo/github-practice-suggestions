package practice.java;

public class PrimeFactorization extends PrimeInput {

	public static boolean isPrime(long number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void calculatePrimes(long userInput) {
		int count = 0;
		
		for (long i = 0; i < userInput; i++) {
			if (isPrime(i)) {
				System.out.printf("%12d", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
				// check if count is and exit if it is
				if (count == userInput) {
					System.out.println("Breaking out of loop");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		PrimeInput userInput = new PrimeInput();
		calculatePrimes(userInput.getUserInput());
	}
}

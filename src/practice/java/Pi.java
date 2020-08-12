package practice.java;

/**
 * 
 * @author Shane Mayo
 * 
 * Computes PI using the Leibniz formula, then outputs the computed PI value, as well as the Math.PI value. 
 * 
 * It should be noted that the Leibniz formula will not be exact, as it would take far too many iterations
 * to be an exact match up to the Math.PI value. As is, the current number of iterations is set to 100 million.
 * 
 */

public class Pi {
	
	public Pi() {
		
		leibnizFormula(100_000_000L);
	}
	
	private void caculatePiToNth() {
		
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
		System.out.printf("Leibniz Computation:\t%.15f%nMath.PI Actual:\t\t%.15f", pi, Math.PI);
	}
	
	public static void main(String[] args) {
		new Pi();
	}
}

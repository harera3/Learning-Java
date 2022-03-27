package ihh_javaguide02;

// Demonstrating the short-circuit operators.

public class Ex0211ShortCircOps {
	public static void main(String[] args) {
		int n, d;
		
		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		d = 0; // d is now set to zero
		
		// The second operand will not be evaluated
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is again a factor of " + n);
		
		// Evaluating both expressions leads to an error.
		if(d != 0 & (n % d) == 0)
			System.out.println(d + " is once again a factor of " + n);
	}

}



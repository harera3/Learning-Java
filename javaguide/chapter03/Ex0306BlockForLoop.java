package ihh_javaguide03;

// Showing square roots of 1 to 49 and the rounding error.

public class Ex0306BlockForLoop {
	public static void main(String[] args) { 
		double num, sqroot, rderr; 
		for(num = 1.0; num < 30.0; num += 3) { 
			sqroot = Math.sqrt(num);
			System.out.println("Square root of " + num + 
                    " is " + sqroot); 
			
			// rounding error
			rderr = num - (sqroot * sqroot); 
			System.out.println("Rounding error is " + rderr);
			System.out.println();
		}
	}
}


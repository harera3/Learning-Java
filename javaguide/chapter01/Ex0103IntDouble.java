package ihh_javaguide;

/*
 	This example illustrates the differences between int and double.
 	Example 3 from chapter 1.
 */
class Ex0103IntDouble {
	public static void main(String[] args) {
		int v;
		double x;
		
		v = 10;
		
		x = 10.0;
		
		System.out.println("Original value of v: " + v);
		System.out.println("Original value of x: " + x);
		System.out.println(); // print blank line
		
		v = v / 4;
		x = x / 4;
		
		System.out.println("v after division: " + v);
		System.out.println("x after division: " + x);
	}

}



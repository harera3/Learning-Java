package ihh_javaguide02;

// Boolean type demonstration

public class Ex0204Boolean {
	public static void main(String[] args) {
		boolean b;	
		
		b = true;
		System.out.println("b is " + b);
		
		// a boolean value can control the if statement
		if(b) System.out.println("This is executed.");
		
		System.out.println();
		
		b = false;
		System.out.println("b is " + b);
		if(b) System.out.println("This is not executed.");
		
		// boolean value from relational operator
		System.out.println("10 > 9 is " + (10 > 9));
	}

}



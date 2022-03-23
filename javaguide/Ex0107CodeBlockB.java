package ihh_javaguide;

/*
 	This example demonstrates a block of code
 	It's example 7 of chapter 1. 
 */

public class Ex0107CodeBlockB {
	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		// This if statement targets the block below it
		if(i == 0) {
			System.out.println("i does not equal zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}
		
		System.out.println("The entire block got skipped");
	}

}



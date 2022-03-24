package ihh_javaguide;

/*
 	This is my own challenge; not in the book.
 	I want to replicate Ex0108GalToLitTable example.
 	I will convert inches to centimeters (1in = 2.54cm).
 */

public class Proj01InToCm {
	public static void main(String[] args) {
		double inches, centimeters;
		int counter;
		
		// Line counter will initially be set to zero.
		counter = 0;
		for(inches = 1; inches <= 40; inches++) {
			centimeters = inches * 2.54;
			System.out.println(inches + " inches is " + centimeters + " centimeters.");
			
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}



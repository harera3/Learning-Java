package ihh_javaguide;

/*
 	This program displays a conversion table of gallons to liters.
 	This is example 8 of chapter 1
 */

public class Ex0108GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters;
		int counter;
		
		// line counter is initially set to zero.
		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // converting to liters
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			// Increment the line counter with each loop iteration.
			counter++;
			// Every 10th line, print a blank line.
			if(counter == 10) {
				System.out.println();
				counter = 0; // Reset the line counter
			}
		}
	}
}

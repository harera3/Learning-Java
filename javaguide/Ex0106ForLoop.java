package ihh_javaguide;

/*
 	This example will demonstrate the "for loop".
 	It's exercise 6 of chapter 1.
 */

public class Ex0106ForLoop {
	public static void main(String[] args) {
		int count;
		
		// The following loop iterates 5 times.
		for(count = 0; count < 5; count = count + 1)
			System.out.println("This is count: " + count);
		
		System.out.println("Done!");
	}

}


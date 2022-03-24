package ihh_javaguide02;

/*
 	This program will compute the number of cubic inches
 	in one cubic mile.
 	It's example 1 of chapter 2
 */

public class Ex0201CubicInchesMile {
	public static void main(String[] args) {
		long cubic_in;
		long one_mi;
		
		one_mi = 5280 *12;
		cubic_in = one_mi * one_mi * one_mi;
		
		System.out.println("There are " + cubic_in + " cubic inches in cubic mile.");
	}
}



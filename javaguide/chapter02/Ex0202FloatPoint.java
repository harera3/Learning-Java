package ihh_javaguide02;

/*
 	In this example, we will calculate the length
 	of the hypotenuse given the lengths of the two 
 	opposing sides. This is example 2 of chapter 2
 */

public class Ex0202FloatPoint {
	public static void main(String[] args) {
		double x, y, z;
		
		x = 4;
		y = 5;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is " + z);
	}

}


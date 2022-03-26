package ihh_javaguide02;

// Demonstrating the % operator.

public class Ex0209Modulus {
	public static void main(String[] args) {
		int inresult, inremain;
		double doubresult, doubremain;
		
		inresult = 10 / 3;
		inremain = 10 % 3;
		doubresult = 10.0 / 3.0;
		doubremain = 10.0 % 3.0;
		
		System.out.println("Result and remainder of 10 / 3: " + 
                       inresult + "\t" + inremain);
		System.out.println("Result and remainder of 10.0 / 3.0: " + 
                doubresult + "\t" + doubremain); 
	}

}


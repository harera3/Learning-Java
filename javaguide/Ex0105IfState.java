package ihh_javaguide;

/*
 	This example will demonstrate the if statement.
 	It's example 5 of chapter 1.
 */
public class Ex0105IfState {
	public static void main(String[] args) {
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a is less than b");
		
		if(a == b) System.out.println("this won't print");
		
		System.out.println();
		
		c = a - b; // this means c is equal to -1.
		
		System.out.println("c contains -1");
		if(c >= 0) System.out.println("c is not negative");
		if(c < 0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a; // c is now equal to 1.
		
		System.out.println("c contains 1");
		if(c >= 0) System.out.println("c is not negative");
		if(c < 0) System.out.println("c is negative");
	}
}


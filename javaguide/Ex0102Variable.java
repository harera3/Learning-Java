package ihh_javaguide;

/*
   This example demonstrates a variable.
   It's the second example from chapter 1 (Ex0102).
 */

public class Ex0102Variable {
	public static void main(String[] args) {
		int myVar1; // first variable declared
		int myVar2; // second variable declared
		
		myVar1 = 1024; // first variable is assigned value
		
		System.out.println("myVar1 contains " + myVar1);
		
		myVar2 = myVar1 / 2;
		
		System.out.print("myVar2 contains myVar1 / 2: ");
		System.out.println(myVar2);
	}
	
}




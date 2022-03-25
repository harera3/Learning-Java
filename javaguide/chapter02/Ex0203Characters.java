package ihh_javaguide02;

// Character variables can be handled like integers

public class Ex0203Characters {
	public static void main(String[] args) {
		char ch;
		
		ch = 'P';
		System.out.println("ch contains " + ch);
		
		ch++; // a char can be incremented
		System.out.println("ch is now " + ch);
		
		ch = 83; // a char can be assigned an integer value
		System.out.println("ch is now " + ch);
	}

}


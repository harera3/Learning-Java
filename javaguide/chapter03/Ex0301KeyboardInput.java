package ihh_javaguide03;

// Reading a keyboard character.

public class Ex0301KeyboardInput {
	public static void main(String[] args)
		throws java.io.IOException {
			
			char ch;
			
			System.out.print("Press a key followed by ENTER: ");
			
			ch = (char) System.in.read();
			System.out.println("Your key is: " + ch);		
	}
}


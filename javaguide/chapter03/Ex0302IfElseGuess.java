package ihh_javaguide03;

public class Ex0302IfElseGuess {
	public static void main(String[] args)
		throws java.io.IOException {
		
		char ch, answer = 'Y';
		
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
		
		ch = (char) System.in.read();
		
		if(ch == answer) System.out.println("** Right **");
		else System.out.println("...Sorry, you're wrong.");
	}
}


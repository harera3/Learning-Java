package ihh_javaguide03;

// Guessing keyboard letter with nested ifs.

public class Ex0303NestedIfGuess {
	public static void main(String[] args)
		throws java.io.IOException {
		
		char ch, answer = 'Y';
		
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
				
		ch = (char) System.in.read();
		
		if(ch == answer) System.out.println("** Right **");
		else {
			System.out.print("...Sorry, you're ");
			if(ch < answer) System.out.println("too low");
			else System.out.println("too high");
		}
	}

}



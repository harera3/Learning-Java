package ihh_javaguide03;

//Demonstrating the do-while loop. 

public class Ex0308DoWhileLoop {
	public static void main(String[] args)
		throws java.io.IOException {
		
		char ch; 
		
		do {
			System.out.println("Press a key followed by ENTER: "); 
			ch = (char) System.in.read(); 
		}   while(ch != 'q'); 
	}
}


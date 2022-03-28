package ihh_javaguide03;

//Use continue.

public class Ex0311Continue {
	public static void main(String[] args) { 
		int i; 
		
		for(i = 0; i<=100; i++) { 
			if((i%2) != 0) continue; 
			System.out.print(i + " ");
		}
	}

}


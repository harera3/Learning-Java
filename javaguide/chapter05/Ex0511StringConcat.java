package ihh_javaguide05;

//Using concatenation to prevent long lines.

public class Ex0511StringConcat {
	public static void main(String[] args) {
		String longStr = "This could have been " + 	
				"a very long line that would have " + 
			     "wrapped around.  But string concatenation " + 
			     "prevents this.";
		
		System.out.println(longStr); 
	}
}


package ihh_javaguide05;

// Demonstrating StringBuffer and StringBuilder.

public class Ex0512StringBuffBuild {
	public static void main(String[] args) {
		StringBuffer sbuff = new StringBuffer("Java rules");
		StringBuilder sbuild = new StringBuilder("Yes, Java rules");
		
		System.out.println("buffer = " + sbuff);
		System.out.println("buffer length = " + sbuff.length());
		System.out.println("buffer capacity = " + sbuff.capacity());
		
		System.out.println();
		
		System.out.println("builder = " + sbuild);
		System.out.println("builder length = " + sbuild.length());
		System.out.println("builder capacity = " + sbuild.capacity());
	}
}


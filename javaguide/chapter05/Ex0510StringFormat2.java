package ihh_javaguide05;

// Demonstrating argument concatenation

public class Ex0510StringFormat2 {
	public static void main(String args[]) {
		// Custom input string to be formatted
        String str1 = "Java";
        String str2 = " more Java";
        
        /*
         *  %1$ represents first argument
         *  %2$ second argument
         */
        String str = String.format(
                "My favorite programming language"
                    + " is: %1$s, %1$s and %2$s",
                str1, str2);
      
        // Print and display the formatted string
        System.out.println(str);
	}
}

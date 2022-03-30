package ihh_javaguide05;

// Demonstrating the String.format() method.

public class Ex0509StringFormat {
	public static void main(String args[]) {
		// Custom input string to be formatted
        String str = "GeeksforGeeks";
  
        // Concatenation of two strings
        String s = String.format("My Company name is %s", str);
  
        // Output is given up to 8 decimal places
        String str2 = String.format("My answer is %.8f", 47.65734);
  
        // Here answer is supposed to be %15.8f" and
        // "47.65734000" there are 15 spaces
        String str3 = String.format("My answer is %18.7f",
                                    47.65734);
  
        // Print and display strings
        System.out.println(s);
        System.out.println(str2);
        System.out.println(str3);
	}
}


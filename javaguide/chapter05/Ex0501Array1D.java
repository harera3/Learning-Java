package ihh_javaguide05;

//Demonstrating a one-dimensional array.

public class Ex0501Array1D {
	public static void main(String[] args) {
		int[] sample = new int[10]; 
	    int i; 
	 
	    for(i = 0; i < 10; i++)	    	
	    	sample[i] = i; 
	 
	    for(i = 0; i < 10; i++)
	    	System.out.println("This is sample[" + i + "]: " + 
	    			sample[i]); 
	}
}


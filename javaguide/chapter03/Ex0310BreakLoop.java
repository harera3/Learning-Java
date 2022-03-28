package ihh_javaguide03;

//Using break to exit a loop.

public class Ex0310BreakLoop {
	public static void main(String[] args) { 
		int num; 
		
		num = 100; 
		
		for(int i=0; i < num; i++) { 
			if(i*i >= num) break;
			System.out.print(i + " ");
		} 
		System.out.println("Loop complete."); 	
	}

}


package ihh_javaguide02;

// Demonstrating the basic arithmetic operators.

public class Ex0208BasicMath {
	public static void main(String[] args) {		
		System.out.println("Integer Arithmetic");
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = -d;
		System.out.println("\ta = " + a);
		System.out.println("\tb = " + b);
		System.out.println("\tc = " + c);
		System.out.println("\td = " + d);
		System.out.println("\te = " + e);
		
		System.out.println("\nFloating Point Arithmetic");
		double da = 1 + 1;
		double db = da * 3;
		double dc = db / 4;
		double dd = dc - a;
		double de = -dd;
		System.out.println("\tda = " + da);
		System.out.println("\tdb = " + db);
		System.out.println("\tdc = " + dc);
		System.out.println("\tdd = " + dd);
		System.out.println("\tde = " + de);
	}

}


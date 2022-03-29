package ihh_javaguide04;

//Adding a constructor. 

class Vehicle4 {
	int passengers; // number of passengers 
	int fuelcap;    // fuel capacity in gallons 
	int mpg;        // fuel consumption in miles per gallon 
	
	// This is a constructor for Vehicle. 
	Vehicle4(int p, int f, int m) { 
	    passengers = p; 
	    fuelcap = f; 
	    mpg = m; 
	} 
	  
	// Return the range. 
	int range() {
		return mpg * fuelcap;
	}
	
	// Compute fuel needed for a given distance. 
	double fuelNeeded(int miles) { 
		return (double) miles / mpg; 
	} 
}

public class Ex0404VehicleConstr {
	public static void main(String[] args) { 
		
		 
	    // construct complete vehicles 
	    Vehicle4 minivan = new Vehicle4(7, 16, 21); 
	    Vehicle4 sportscar = new Vehicle4(2, 14, 12); 
	    double gallons; 
	    int dist = 252; 
	 
	    gallons = minivan.fuelNeeded(dist); 
	 
	    System.out.println("To go " + dist + " miles minivan needs " + 
	                       gallons + " gallons of fuel."); 
	 
	    gallons = sportscar.fuelNeeded(dist); 
	 
	    System.out.println("To go " + dist + " miles sportscar needs " + 
	                       gallons + " gallons of fuel."); 
	 
	} 

}



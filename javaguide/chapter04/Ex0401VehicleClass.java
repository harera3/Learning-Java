package ihh_javaguide04;

//A program that uses the Vehicle class. 

class Vehicle {
	int passengers; // number of passengers 
	int fuelcap;    // fuel capacity in gallons 
	int mpg;        // fuel consumption in miles per gallon 
}

//This class declares an object of type Vehicle. 
public class Ex0401VehicleClass { 
	 public static void main(String[] args) { 
		 Vehicle minivan = new Vehicle(); 
		 int range; 
		 
		 // assign values to fields in minivan 
	     minivan.passengers = 7; 
	     minivan.fuelcap = 16; 
	     minivan.mpg = 21; 
	    
	     // compute the range assuming a full tank of gas 
	     range = minivan.fuelcap * minivan.mpg; 
	     System.out.println("Minivan can carry " + minivan.passengers + 
	                       " with a range of " + range);
	 }		    
}



package ihh_javaguide02;
/*
 	Let's calculate how far away the lightning is.
 	It's sound takes 7.2 seconds to reach us.
 	Sound travels approx. 1,100 feet per second through air.
 */

public class Ex0205SoundDist {
	public static void main(String[] args) {
		double dist;
		
		dist = 7.2 * 1100;
		
		System.out.println("The lightning is " + dist + 
				" feet away.");
		
		// Distance to end of cave if echo is 1.6 seconds.
		double dist2;
		
		dist2 = 1100 * 1.6 / 2;
		
		System.out.println("The cave is " + dist2 + 
				" feet deep.");

	}

}


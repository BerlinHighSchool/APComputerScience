import java.util.Random;

public class mathtime {
	public static void main(String[] args) {
		/*
		 * Math Functions
		 * Absolute value - Math.abs(int) --> Returns an int
		 * 					Math.abs(double) --> returns a double
		 * Trig - Math.sin(double angle) --> returns a double, measured in radians
		 * 		  Math.cos(double angle) --> returns a double
		 * 		  Math.tan(double) --> returns a double
		 * 		  Math.asin(double) --> returns a double
		 * 		  Math.acos(double) --> returns a double
		 * 		  Math.atan(double) --> returns a double
		 * Exponents - Math.pow(double base, double exponent) --> returns a double
		 * 			   Math.exp(double power) --> returns e raised to power, --> returns a double
		 * Square root - Math.sqrt(double) --> returns a double
		 * Floor/Ceiling - Math.ceil(double) --> round up on every double. ex. 4.1 --> 5, 4.7 --> 5, --> returns a double
		 * 				   Math.floor(double) --> rounds down on every value. ex. 4.1 --> 4, 5.8 --> 5, --> returns a double
		 */
		
		double a = Math.pow(234, 450);
		System.out.println(Math.abs(-4));
		System.out.println(a);
		
		/*
		 * Random Numbers
		 * 1) import java.util.Random;
		 * Object Random() - lets us create a new object Random that will generate random numbers
		 * Random name = new Random(); <-- creates the random number generator
		 * Methods - name.nextInt() --> random int between 0 - 1
		 * 			 name.nextDouble --> random double between 0.0 (inclusive) and 1.0 (exclusive)
		 */
		Random gen = new Random();
		int random1 = gen.nextInt(10); // <-- 10 is the range of values I can receive, 0 - 9
		int random2 = gen.nextInt(24); // <-- range of values: 0 - 23
		int random3 = gen.nextInt(10)+1; // <-- 1 - 10?
		// Generate random numbers between 34-49
		int random4 = gen.nextInt(16)+34;
		System.out.println(random1 + " " + random2 + " " + random3 + " " + random4);
		int random5 = gen.nextInt(50)+101;
		int random6 = (gen.nextInt(8)*2)+3;
		System.out.println(random6);
		String s = "4";
		
		Integer.parseInt(s);
	}	
}

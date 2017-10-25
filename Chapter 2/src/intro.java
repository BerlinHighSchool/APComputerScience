
public class intro {
	public static void main(String[] args) {
		// This is a comment. It's ignored when the program is run
		/* This is
		  a 
		  multi line comment */
		
		String adele1 = "Hello, it's me.";
		String adele2 = " - Adele";
		String objectString = new String("Water or soda?");
		int number1 = 5;
		double number2 = 5.5;
		int number3 = 7;
		int number4 = number1 + number3;
		double number5 = number1 + number2;
		System.out.println(adele1 + adele2);
		System.out.println(number4);
		
		int a = 2;
		int b = 3;
		System.out.println("2 + 3 = " + (a + b));
		int stringLength = objectString.length()-1;
		System.out.println(objectString.length());
		System.out.println(objectString.charAt(stringLength));
		System.out.println(objectString.toUpperCase());
		
		/*System.out.print("How are you?");
		System.out.println(" - Adele");
		System.out.println("It's me.");*/
	}
}

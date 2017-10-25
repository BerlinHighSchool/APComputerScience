import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args)
	{
		/*int a = 1;
		for(int i = 0; i < 10; i++)
		{
			System.out.print(i+1 + " ");
			//System.out.print(a + " ");
			//a++; //a = a + 1, a+=1;
		}*/

		// Write a loop that calculates and displays
		// the first 5 even #'s starting at 2
		/*
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i*2+2);
		}*/
		// Take user input as a string and print
		// each character on a new line
		/*
		Scanner s = new Scanner(System.in);
		String newLine = s.nextLine();
		String bananas = "Bananas";
		for(int i = 0; i < newLine.length(); i++) {
			System.out.println(newLine.charAt(i));
			System.out.println("I Like pizza");
		}*/
		// Use == for equality comparison of numbers.
		// >, >=, <, <=, !=
		// Use .equals(Object) or .equalsIgnoreCase(String) for comparison
		// of objects
		// !String1.equals(String2) <-- Not equals
		// Logical and --> &&
		// Logical or --> ||

		// Fibonacci Series
		int n = 0, m = 1;
		System.out.print(n + " " + m + " ");
		for(int i = 0; i < 18; i++)
		{
			int k = m + n;
			n = m;
			m = k;
			System.out.print(k + " ");
		}
		System.out.println();
		// Returns prime factors of a number.
		int number = 7*13;
		boolean prime = true;
		for(int i = 3; i < number; i+=2)
		{
			if(number % i == 0)
			{
				for(int k = 2; k < i/2; k++) {
					if(i % k == 0)
						prime = false; 
				}
				if(prime == true)
					System.out.println(i);
			}
		}

	}
}

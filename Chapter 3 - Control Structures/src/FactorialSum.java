public class FactorialSum {
	public static void main(String[] args)
	{
		int sum = 0; // Keeps track of the sum of the digits
		for(int j = 10; j <= 15; j++) // runs the factorials from 10-15
		{
			int a = 1; // this is the value that i'm going to be the product.
			for(int i = 1; i <= j; i++) // i is what i'm multiplying by
				a*=i; // a = a * i;
			String b = "" + a; // this turns a from an int to a string.
			for(int i = 0; i < b.length(); i++)
				sum += Integer.parseInt("" + b.charAt(i)); // this takes each number in the string and adds it to the sum.
		}		// sum = sum + digit at each index
		System.out.println(sum);
	}
}
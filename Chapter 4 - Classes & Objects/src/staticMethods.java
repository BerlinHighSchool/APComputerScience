import java.util.Scanner;
public class staticMethods {
	static String s1;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.nextLine();
		if(isPalindrome()==false)
			System.out.println(s1 + " is not a palindrome");
		else
			System.out.println(s1 + " is a palindrome");
	}
	
	public static boolean isPalindrome()
	{
		for(int i = 0; i < s1.length(); i++) {
			if(s1.toLowerCase().charAt(i)!=s1.toLowerCase().charAt(s1.length()-1-i))
				return false;
		}
		return true;
		
	}
	
	// Write a method that returns the nth term in the Fib. sequence.
}









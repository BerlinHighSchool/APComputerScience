import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		boolean palindrom = true;
		Scanner s = new Scanner(System.in);
		String word = s.nextLine().toLowerCase();
		for(int i = 0; i < word.length(); i++)
			if(word.charAt(i)!=word.charAt(word.length()-1-i))
				palindrom = false;
		if(palindrom)
			System.out.println(word + " is a palindrome");
		else
			System.out.println(word + " is not a palindrome");
	}
}

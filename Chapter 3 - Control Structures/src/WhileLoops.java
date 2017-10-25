import java.util.*;
public class WhileLoops {
	public static void main(String[] args)
	{
		Random gen = new Random();
		int random = gen.nextInt(15)+1;
		int guess;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("Guess a number between 1 - 15: ");
			guess = scanner.nextInt();
			while(guess < 1 || guess > 15) // guess < 1 or guess > 15
			{
				System.out.print("Number out of range. Try again.\nGuess a number between 1 - 15: ");
				guess = scanner.nextInt();
			}
			if(guess < random)
				System.out.println("Too low.");
			else if(guess > random)
				System.out.println("Too high.");
		}while(guess != random);
		System.out.println("You win. The number was " + random);
	}
}

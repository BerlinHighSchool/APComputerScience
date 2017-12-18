import java.util.*;
public class tryCatch {
	public static void main(String[] args) {
		boolean isNaN = true;
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.print("Enter a number: ");
				int num = s.nextInt();
				isNaN = true;
				
			} catch(InputMismatchException e) {
				System.out.println("You did not enter a number.");
				System.out.print("Try again. ");
				isNaN = false;
			}
		}while(!isNaN);
		System.out.println("yay.");
	}
}

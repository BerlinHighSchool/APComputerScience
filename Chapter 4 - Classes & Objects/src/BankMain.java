
public class BankMain {
	public static void main(String[] args){
		BankAccount joshy = new BankAccount("Josh Malcarne", "1234567890", 11.23, true);
		BankAccount geoff = new BankAccount("Jeff Bengiovanni", "4", 45.92, true);
		//System.out.println("Josh has $" + joshy.deposit(40.13));
		joshy.transfer(geoff, 5);
		joshy.deposit(100.99); // Money received for writing problem set solutions
		joshy.deposit(34.52); // Money received for writing poor problem set solutions
		joshy.withdraw(3.28); // Tax for asking questions
		joshy.withdraw(44.66); // He asked a lot of questions that day.
		joshy.deposit(9.56); // Federal refund on taxes.
		System.out.println(joshy.pastTransactions());
	}
}
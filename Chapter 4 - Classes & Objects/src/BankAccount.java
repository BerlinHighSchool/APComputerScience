
public class BankAccount {
	private String name, accountNum, transactions = "";
	private double balance;
	private boolean checking;
	/* Constructor - sets up the initial characteristics of the object
	 - Name (String)
	 - Balance (double)
	 - Account # (String)
	 - Checking/Savings (boolean)
	 */
	public BankAccount(String tname, String taccountNum, double tbalance, boolean tchecking) {
		name = tname;
		accountNum = taccountNum;
		if(tbalance < 0)
			balance = 0;
		else	
			balance = tbalance;
		checking = tchecking;
	}
	
	// Deposit
	public double deposit(double deposit)
	{
		if(deposit > 0.00)
			balance += deposit;
		transactions += "Deposit for $" + deposit + "\n";
		return checkBalance();
	}
	
	//Withdraw money
	public double withdraw(double withdraw)
	{
		if(withdraw > 0.00 && withdraw <= balance)
			balance -= withdraw;
		transactions += "Withdraw for $" + withdraw + "\n";
		return checkBalance();
	}
	
	public double checkBalance()
	{
		return balance;
	}
	
	public void close()
	{
		name = "Closed";
		accountNum = null;
		balance = 0;
	}
	
	public double transfer(BankAccount transferee, double amount)
	{
		if(amount > balance || amount < 0)
			amount = 0;
		transactions += "Transfer from " + name + " to " + transferee.getName() + " for $" + amount + "\n";
		withdraw(amount);
		transferee.deposit(amount);
		return balance;
	}
	
	public String pastTransactions()
	{
		return transactions;
	}
	
	// toString() -- exists, but we are overriding it
	public String toString()
	{
		String result = "Account Holder: " + name + "\nAccount #: " + accountNum + "\nBalance: $" + balance + "\nAccount Type: ";
		if(checking) // if(checking == true)
			result += "Checking";
		else
			result += "Savings";
		
		return result;
	}
	
	public String getName()
	{
		return name;
	}
}









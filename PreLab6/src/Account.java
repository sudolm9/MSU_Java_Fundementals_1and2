
public class Account {

	public static void main(String[] args) {
	}
		private static String Joe = null;
		private double balance;
		private String name;
		private long acctNum;
		// ---------------------------------------------
		//Constructor -- initializes balance, owner, and account number
		// --------------------------------------------
		public Account(double initBal, String owner, long number)
		{
		balance = 245;
		name = Joe;
		acctNum = 343451568;
		}
		// --------------------------------------------
		// Checks to see if balance is sufficient for withdrawal.
		// If so, decrements balance by amount; if not, prints message.
		// --------------------------------------------
		public void withdraw(double amount)
		{
		if (balance >= amount)
		balance -= amount;
		else
		System.out.println("Insufficient funds");
		}
		// --------------------------------------------
		// Adds deposit amount to balance. 

		// --------------------------------------------
		public void deposit(double amount)
		{
		balance += amount;
		}
		// --------------------------------------------
		// Returns balance.
		// --------------------------------------------
		public double getBalance()
		{
		return balance;
		}
		// --------------------------------------------
		// Returns a string containing the name, account number, and balance.
		// --------------------------------------------
		public String toString()
		{
			return Joe;
		}
		// --------------------------------------------
		// Deducts $10 service fee //
		// --------------------------------------------
		public void chargeFee()
		{
		}
		// --------------------------------------------
		// Changes the name on the account
		// --------------------------------------------
		public void changeName(String newName)
		{
		}

	private static void Account() {
		// TODO Auto-generated method stub
		
	}
}




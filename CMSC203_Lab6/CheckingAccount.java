
public class CheckingAccount extends BankAccount{
	// fee for clearing one check
	static final double FEE = 0.15; 
	/*
	 * This constructor initializes a CheckingAccount object with a given owner's name and initial balance.
	 * It also appends "-10" to the account number to differentiate it from other account types.
	 * @param name the name of the account owner
	 * @param amount the initial balance of the account
	 */
	public CheckingAccount(String name, double amount) {
		// Call superclass constructor
		super(name, amount);
		// Initialize the new account number
		String updatedAccountNumber = getAccountNumber();
		setAccountNumber(updatedAccountNumber + "-10");
	}
	
	/*
	 * This method allows the user to withdraw money from the checking account.
	 * It deducts a fee for each check cleared.
	 * @param amount the amount to withdraw
	 * @return true if the withdrawal was successful, false if there are insufficient funds
	 */
	public boolean withdraw(double amount) {
		boolean completed = false;
		// Add the fee to the amount to be withdrawn
		amount += FEE;
		// Call the superclass withdraw method to attempt the withdrawal and set completed status
		completed = super.withdraw(amount);
		// Check if the withdrawal was successful
		return completed;
	}
	
}

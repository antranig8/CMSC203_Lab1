
public class SavingsAccount extends BankAccount {
	// Instance variable for interest rate
	private double rate = 0.025;
	// Instance variable for account number
	private int savingsNumber = 0;
	// Instance variable to hide the account number
	private String accountNumber;
	
	/*
	 * This constructor initilaizes a SavingsAccount object with a given owner's name and initial balance.
	 * Calls for superclass constructor and also sets the account number
	 * @param name the name of the account owner
	 * @param amount the initial balance of the account
	 */
	public SavingsAccount(String name, double amount) {
		// Call superclass constructor
		super(name, amount);
		// Set this account number to the superclass account number
		accountNumber = super.getAccountNumber();
		// Apped the account number with the savings number an hyphen
		accountNumber += "-" + savingsNumber;
	}
	
	/*
	 * This method calculates one months worth of interest on the balance and deposit it into the account
	 */
	public void postInterest() {
		double interest = getBalance() * rate / 12;
		deposit(interest);
	}
	/*
	 * Method that overrides the getAccountNumber method from the superclass
	 * @return the account number of the savings account
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/*
	 * Copy constructor creates another account for the same owner
	 * @param SavingsAccount oldAccount the account with information to copy
	 * @param double amount the beginning balance of the new account
	 */
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		// Call the superclass constructor
		super(oldAccount, amount);
		// // Set the account number for the new account
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
}

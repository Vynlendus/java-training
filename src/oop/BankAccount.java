package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// Static >> Belongs to the class, not the object instance.
	// Final >> Constant (Often static final)
	private static final String routingNumber = "132489";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / set up / initialize properties of an object.
		// 2. Constructors are implicitly called upon INSTANTIATION.
		// 3. The same name as the class itself.
		// 4. Constructors have no return type at all.
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same nmethod name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, and Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("Initial deposit of: $" + initDeposit);
		String Msg = "";
		if (initDeposit < 1000) { 
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		} else { 
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance += initDeposit;
	}
	
	// Interface Methods 
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) { 
		this.name = name;
	}
	
	// Allow the user to get the name
	public String getName() { 
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Define methods
	public void deposit(double amount) { 
		balance += amount;
		showActivity("DEPOSIT");
	}

	public void withdraw(double amount) {
		balance -= amount;
		showActivity("WITHDRAW");
	}
	
	// Private: Can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	public void checkBalance() {
		System.out.println("Current Balace: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() { 
		return "[ NAME: " + name + ". ACCOUNT NUMBER: " + accountNumber + ". ROUTING NUMBER: " + routingNumber + ". BALANCE: $" + balance + " ]";
	}
}

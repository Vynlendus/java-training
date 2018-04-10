package labs;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("182733192", 1000);
		BankAccount acc2 = new BankAccount("164192673", 2000);
		BankAccount acc3 = new BankAccount("796132467", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest {
	// Properties of Bank Account
	private static int ID = 1000;	// Internal ID
	private String accountNumber;	// ID + Random 2 digit number + first 2 of SSN
	private static final String routingNumber = "005400657"; 
	private String name;
	private String ssn;
	double balance;
	
	// Constructor 
	public BankAccount(String ssn, double initDeposit) {
		this.ssn = ssn;
		this.balance = initDeposit;
		ID++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + ssn.substring(0, 2);
		System.out.println("Your Account Number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying Bill: $" + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance += amount;
		System.out.println("Making Deposit: $" + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	@Override
	public void accrue() {
		balance *= (1 + rate / 100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	
	
}

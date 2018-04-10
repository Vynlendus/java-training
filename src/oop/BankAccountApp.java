package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		// Old Method: acc1.name = "Ryan McKenna";
		// With Encapsulation
		acc1.setName("Ryan McKenna");
		System.out.println(acc1.getName());
		acc1.setSsn("10283180");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "091867230";
		acc1.balance = 10000;
		
		acc1.deposit(1500);

		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "091867230";
		
		BankAccount acc3 = new BankAccount("Savings Account", 75000);
		acc3.accountNumber = "091867230";
		
		
		/*
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = 4.5;
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}

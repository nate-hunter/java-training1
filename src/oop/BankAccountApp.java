package oop;

public class BankAccountApp {
	public static void main(String[] args) {
		// This app will create a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
//		acc1.name = "Roger Panda"; // NOT best practice.
		acc1.setName("Roger Panda"); // w/ Encapsulation
		acc1.accountNumber = "00819007";
		acc1.deposit(2500);
		acc1.deposit(2500);
		acc1.withdraw(1400);
		System.out.println(acc1.toString());
		System.out.println(acc1.getName());
		
		/*
		BankAccount acc2 = new BankAccount("CHECKING ACCOUNT");
		
		BankAccount acc3 = new BankAccount("SAVINGS ACCOUNT", 5000);
		acc3.name = "Panda";
		
		System.out.println(BankAccount.routingNumber);
		
		System.out.println(acc3.name + " // acc3's money in bank = $" + acc3.accountType);
		*/
		
	}
}

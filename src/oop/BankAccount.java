package oop;

public class BankAccount implements IRate {
	// because we are going to instantiate objects from this class, we don not need a main method

	// VARIABLES:
	String accountNumber;
	private static final String routingNumber = "70010058"; // this variable belongs to the class, can't be changed, and it is only access within the private field/class.
	private String name;
	String ssn;
	String accountType;
	double balance;
	
	String lineDivider = "++++++++++++++++++++++++++++++++++";
	
	// CONSTRUCTOR DEFINITIONS:
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// OVERLOADING:
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT TYPE: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// accountType and initDepost are LOCAL variables
		System.out.println("NEW ACCOUNT TYPE: " + accountType);
		System.out.println("INITIAL DEPOSIT: $" + initDeposit);
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: Minimum depost must be greater than $1,000";
		} else {
			msg = "Thanks for your initial depost of: $" + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	// GETTERS & SETTERS:
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// INTERFACE METHODS:
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}
	
	// METHODS:
	public void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance -= amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) { // Since private, can only be called from w/in class
		System.out.println("YOUR RECENT ACTIVITY: " + activity);
		if (activity == "DEPOSIT") {
			System.out.println("YOUR NEW BALANCE IS: +$" + balance);
		} else {
			System.out.println("YOUR NEW BALANCE IS: -$" + balance);
		}
		
		System.out.println(lineDivider);
	}
	
	void checkBalance() {
		System.out.println("BALANCE: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT#: " + accountNumber + ". ROUTING#: " + routingNumber + ". BALANCE: $" + balance + " ]";
	}
}

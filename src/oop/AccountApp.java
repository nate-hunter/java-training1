package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		IRate account1 = new LoanAccount();
		// account1. -> only methods available are from IRate but when called it wall call the methods from the LoanAccount
		account1.increaseRate();
		account1.setRate();

	}

}

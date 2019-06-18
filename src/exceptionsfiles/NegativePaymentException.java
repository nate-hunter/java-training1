package exceptionsfiles;

public class NegativePaymentException extends Exception {
	// Define class variable
	double payment;
	
	// 1. A constructor that takes the value that would throw the exception	
	// 2. Assign the value of the local variable to the class variable
	public NegativePaymentException(double payment){
		this.payment = payment;
	}
	
	// 3. Override the toString() method to include the specific exception message
	public String toString(){
		return "ERROR: Cannot take negative payment of $" + payment + ".";
	}
	
}

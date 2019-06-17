package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		
		printName();
		
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		int mainProduct = multiplyNumbers(numA, numB);
		
		System.out.println("The product of " + numA + " & " + numB + " is " + mainProduct);
		
	}
	
	static void printName() {
		System.out.println("My name is Nate");
	}
	
	static void addNumbers(int numberA, int numberB){
		// this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
		
	}
	
	static int multiplyNumbers(int numberA, int numberB) {
		int product = numberA * numberB;
		addNumbers(product, numberA);
		return product;
	}

}

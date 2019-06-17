package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Create a variable to define my career
		
		// Declare a variable:
		String career;
		System.out.println("Program starting now");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare and define
		int hrsPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// Compute my annual salary
		// annSal = rate * hrsPerWeek * weeksPerYear
		double salary = rate * hrsPerWeek * weeksPerYear;
		
		System.out.println("My salary as a " + career + ": " + salary);
		
	}
}

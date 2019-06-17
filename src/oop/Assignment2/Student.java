package oop.Assignment2;

public class Student {
	
	// VARIABLES
	private static int id = 1000;
	String userId;
	String name;
	String ssn;
	String email;
	
	
	// CONSTRUCTORS	
	Student(String name, String ssn){
		id++;
		this.ssn = ssn;
		this.name = name;
		email = name + "@learnJava.com";
		setUserId();
		System.out.println(name + ", Your email is: " + email + ". Your Student ID is: " + userId);
	}
	
	// METHODS
	private void setUserId(){
		int randomNum = (int) (Math.random() * 10000);
		String last4Ssn = ssn.substring(ssn.length() - 4);
		userId = id + "" + randomNum + "||" + last4Ssn;
	}

}

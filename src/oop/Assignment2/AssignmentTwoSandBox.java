package oop.Assignment2;

public class AssignmentTwoSandBox {

	/* 
	Create a Student Database with the following attributes:
	// - New Student constructor that takes name and SSN in the arguments
	// - Automatically create an email ID based on the name
	// - Set a private static ID
	// - Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	// - Use encapsulation to set variables (phone, city, state)   
	*/
	
	public static void main(String[] args) {
		
		StudentTest stud1 = new StudentTest("Peach", "364172809");
		stud1.setCity("NYC");
		System.out.println(stud1.getCity());
		stud1.enroll("Java 101");
		stud1.pay(1200);
		System.out.println(stud1.toString());

	}
}

class StudentTest {
	
	// VARIABLES
	private static int id = 10;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private double balance = 0;
	private String currentCourse;
//	ArrayList<String> courses = new ArrayList<String>();
	
	
	// CONSTRUCTORS	
	StudentTest(String name, String ssn){
		id++;
		this.ssn = ssn;
		this.name = name;
		email = name.toLowerCase() + "@learnJava.com";
		/*
		void createEmailID(){
			emailID = name.toLowerCase().replace(" ", "")+"@university.edu";
			System.out.println("The Email ID is " + emailID);
		}
		*/
		setUserId();
		System.out.println(name + ", Your email is: " + email + ". Your Student ID is: " + userId);
	}
	
	// METHODS
	private void setUserId(){
		int randomNum = (int) (Math.random() * 10000);
		String last4Ssn = ssn.substring(ssn.length() - 4);
		userId = id + "" + randomNum + last4Ssn;
		/*
		public void setUserID() {
			int max = 9000;
			int min = 1000;
			int random = (int) (Math.random() * (max - min));
			random = random + min;
			System.out.println(random);
			userID = ID + "" + random + ssn.substring(3, 7);
			System.out.println("User ID: " + userID);
		}
		*/
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void enroll(String name){
		double courseCost = 1500;
		balance -= courseCost;
		this.currentCourse = name;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		showCourses();
		checkBalance();
	}
	
	public void showCourses(){
		System.out.println("You are enrolled in: " + currentCourse);
	}
	
	public void pay(int amount){
		balance += amount;
		System.out.println("You paid: $" + amount);
		checkBalance();
	}
	
	public void checkBalance(){
		System.out.println("Your current balance is: $" + balance);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public String toString(){
		return "[ NAME: " + name + ". EMAIL: " + email + ". USER ID: " + userId + ". BALANCE: " + balance +". ]";
	}
	
}

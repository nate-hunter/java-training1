package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This app will read a text file and will retrieve the phone number
		
		String filename = "C:\\Java-nh\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		
		String[] phoneNums = new String[9];
		String phoneNum = null;
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			for(int i = 0; i < phoneNums.length; i++) {
				phoneNums[i] = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Unable to read file: " + filename);
			e.printStackTrace();
		}
		
		
		// Valid phone number:
			// 10 digits long
			// Area code cannot begin with 0 or 9
			// There can be no 911 in the phone number
		
		for(int i = 0; i < phoneNums.length; i++) {
			phoneNum = phoneNums[i];
			System.out.println("Index: " + i);
			try {
				if(phoneNum.length() != 10){
					throw new TenDigitsException(phoneNum);
				} 
				if (phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
					throw new AreaCodeException(phoneNum);
				}
				for(int j = 0; j < phoneNum.length(); j++) {
					if(phoneNum.substring(j, j+1).equals("9")){
						if(phoneNum.substring(j+1, j+3).equals("11")){
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println(phoneNum);
			} catch(TenDigitsException e) {
				System.out.println("ERROR: Phone number is not 10 digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Phone number should not begin with 0 or 9");
				System.out.println(e.toString());
//				e.printStackTrace();
			} catch (EmergencyException e) {
				System.out.println("ERROR: Phone number should not contain 911");
				System.out.println(e.toString());
//				e.printStackTrace();
			}
		}
	}
}

class TenDigitsException extends Exception {
	String phoneNumber;
	
	TenDigitsException(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "TenDigitsException: " + phoneNumber + " (digits: " + phoneNumber.length() + ")";
	}
}

class AreaCodeException extends Exception{
	String phoneNumber;
	AreaCodeException(String number) {
		this.phoneNumber = number;
	}
	
	public String toString() {
		return "AreaCodeException: " + phoneNumber;
	}
}

class EmergencyException extends Exception{
	String phoneNumber;
	
	EmergencyException(String number) {
		this.phoneNumber = number;
	}
	
	public String toString() {
		return "EmergencyException: " + phoneNumber;
	}
}
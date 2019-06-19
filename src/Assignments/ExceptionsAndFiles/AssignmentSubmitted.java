package Assignments.ExceptionsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class AssignmentSubmitted {

	/*
	Read a file that checks the criteria for a password
		// * Read a file that contains multiple sets of passwords
		* Verify that the password contains all of the following criteria:
			1. A number
			2. A letter
			3. Special character (! @ #)
		* Create three User Defined Exceptions for the corresponding criteria.
		* If the password does not meet the criteria, create and throw the appropriate exception
	 */

	public static void main(String[] args) {
		String filename = "C:\\Java-nh\\Files\\AssignmentFile.txt";
		File file = new File(filename);
		
		String data = null;
		String[] dataArr = new String[13];
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			for(int i = 0; i < dataArr.length; i++) {
				dataArr[i] = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Unable to read file: " + filename);
			e.printStackTrace();
		}
		
		
		for(int i = 0; i < dataArr.length; i++) {
			String pw = dataArr[i];
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Array index: " + i + " // " + pw);
			
			try {
				int letterCount = 0;
				int numberCount = 0;
				int specialCount = 0;
				
				for(int j = 0; j < pw.length(); j++){
					if(Pattern.matches("[a-zA-Z]+", pw.substring(j, j+1))){
						letterCount++;
					}
				}				
				for(int n = 0; n < pw.length(); n++){
					if(Pattern.matches("[0-9]+", pw.substring(n, n+1))){
						numberCount++;
					}
				}
				for(int s = 0; s < pw.length(); s++){
					if(Pattern.matches("[!@#$%*&]+", pw.substring(s, s+1))){
						specialCount++;
					}
				}
				
				if (letterCount == 0) {
					throw new LetterExceptionSub(pw);					
				} else if (numberCount == 0) {
					throw new NumberExceptionSub(pw);					
				} else if (specialCount == 0) {
					throw new SpecialCharacterExceptionSub(pw);					
				} else {
					System.out.println("VALID PASSWORD");
				}
			} catch (LetterExceptionSub | NumberExceptionSub | SpecialCharacterExceptionSub e) {
				System.out.println("ERROR: Invalid Password");
				System.out.println(e.toString());
			} 
			
//			} catch (LetterException e) {
//				System.out.println("ERROR: Password does not contain a letter");
//				System.out.println(e.toString());
//			} catch (NumberException e) {
//				System.out.println("ERROR: Password does not contain a number");
//				System.out.println(e.toString());
//			} catch (SpecialCharacterException e) {
//				System.out.println("ERROR: Password does not contain a special character (! @ #)");
//				System.out.println(e.toString());
//			}
		}
		
//		for (String da : dataArr){
//			System.out.println(da);
//		}
		
		for (int y = 0; y < dataArr.length; y++){
			System.out.print("[" + y + "]: " + dataArr[y] + " // ");
		}
		
//		System.out.println(Arrays.toString(dataArr));

		
	}
}

class InvalidCharacterException extends Exception {
	String ch;
	
	InvalidCharacterException(String ch){
		this.ch = ch;
	}
	
	public String toString(){
		return "InvalidCharacterException: " + ch;
	}
}

class LetterExceptionSub extends Exception {

	String passWord;
	
	LetterExceptionSub(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "LetterException: " + passWord;
	}
}

class NumberExceptionSub extends Exception {

	String passWord;
	
	NumberExceptionSub(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "NumberException: " + passWord;
	}
}

class SpecialCharacterExceptionSub extends Exception {

	String passWord;
	
	SpecialCharacterExceptionSub(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "LetterException: " + passWord;
	}
}


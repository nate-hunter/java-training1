package Assignments.ExceptionsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ReadAssignment {
	
	/*
	Read a file that checks the criteria for a password
		// * Read a file that contains multiple sets of passwords
		// * Verify that the password contains all of the following criteria:
			1. A number
			2. A letter
			3. Special character (! @ #)
		// * Create three User Defined Exceptions for the corresponding criteria.
		// * If the password does not meet the criteria, create and throw the appropriate exception
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
			System.out.println("Array index: " + i + " // " + pw + " (" + pw.length() + ")");
			
			try {
				int letterCount = 0;
				int numberCount = 0;
				int specialCount = 0;
				
				boolean letters = false;
				boolean numbers = false;
				boolean specials = false;
				
				for(int j = 0; j < pw.length(); j++){
					System.out.print("[" + j + "]");
					if(Pattern.matches("[a-zA-Z]+", pw.substring(j, j+1))){
						letterCount++;
						letters = true;
					} else if (Pattern.matches("[0-9]+", pw.substring(j, j+1))){
						numberCount++;
						numbers = true;
					} else if (Pattern.matches("[!@#$%*&]+", pw.substring(j, j+1))){
						specialCount++;
						specials = true;
					} else {
//						System.out.println(" {<-INVALID CHARACTER '" + pw.substring(j, j+1) + "' }");
						try { 
							throw new InvalidCharactException(pw.substring(j, j+1)); 
						} catch(InvalidCharactException e){ 
							System.out.println("  " + e.toString()); }
					}
				}	
				
				System.out.println("\nLetters: " + letterCount + " || " + "Numbers: " + numberCount + " || " + "Special Characters: " + specialCount + " ||TOTAL|| " + (letterCount + numberCount + specialCount));
				
				if (letterCount == 0) {
					throw new LettersException(pw);					
				} else if (numberCount == 0) {
					throw new NumbersException(pw);					
				} else if (specialCount == 0) {
					throw new SpecialCharactersException(pw);					
				} else {
					System.out.println(" ~~VALID PASSWORD~~");
				}
			} catch (LettersException | NumbersException | SpecialCharactersException e) {
				System.out.print("| *Invalid Password: ");
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

		// ARRAYS OF PASSWORDS 
		
//		for (String da : dataArr){
//			System.out.println(da);
//		}
		
		for (int y = 0; y < dataArr.length; y++){
			System.out.print("[" + y + "]: " + dataArr[y] + " // ");
		}
		
		System.out.println("\n\nArray Class: " + Arrays.toString(dataArr));

		
	}
}

class InvalidCharactException extends Exception {
	String ch;
	
	InvalidCharactException(String ch){
		this.ch = ch;
	}
	
	public String toString(){
		return "InvalidCharactException: " + ch;
	}
}

class LettersException extends Exception {
	String passWord;
	
	LettersException(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "LettersException: " + passWord;
	}
}

class NumbersException extends Exception {
	String passWord;
	
	NumbersException(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "NumbersException: " + passWord;
	}
}

class SpecialCharactersException extends Exception {
	String passWord;
	
	SpecialCharactersException(String pw) {
		this.passWord = pw;
	}
	
	public String toString(){
		return "SpecialCharactersException: " + passWord;
	}
}


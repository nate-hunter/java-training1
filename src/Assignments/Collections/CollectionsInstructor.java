package Assignments.Collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsInstructor {

	public static void main(String[] args) {
		
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Java-nh\\Files\\AssignmentDataCollections.csv";
		File file = new File(filename);
		String dataRow;

		double balance = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file)); // filename works too, why use File then?

			while((dataRow = reader.readLine()) != null) {
				String[] line = dataRow.split(",");
				transactions.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("DATE: ");
		for( String[] transaction : transactions ) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			
			System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);
			
			if(type.equalsIgnoreCase("credit") || type.equalsIgnoreCase("fee")){
				balance += amount;
			} else if(type.equalsIgnoreCase("debit")){
				balance -= amount;
			}
			System.out.print(" | $" + balance + "\n");
				
			
//			if(type.equals("CREDIT")){
//				System.out.println("CREDIT" + " | +$" + amount);
//			} else if(type.equals("DEBIT")){
//				System.out.println("DEBIT" + " | -$" + amount);
//			}
		}
		
		if (balance > 0) {
			System.out.println("You have a balance of $" + balance);
			System.out.println("You are charged a 10% fee of $" + balance * 0.10);
			System.out.println("Your new balance is $" + balance * 1.1);
		} else if (balance < 0){
			System.out.println("Thanks for your payment");
			System.out.println("You have an overpayment of $" + balance);
		} else {
			System.out.println("Thanks for your payment");
		}

	}

}

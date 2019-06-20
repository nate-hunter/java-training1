package Assignments.Collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CollectionsSandbox {
	
	/*
	Create a Credit Card Statement reader application:
		// * Read a credit card CSV statement
		// * Create a balance variable that calculates the running balance of the user’s account
			// - If the field says CREDIT, then add the amount to the balance
			// - If the field says DEBIT, then subtract the amount to the balance
			// - If the final amount is greater than zero, charge a 10% fee and warn the user
			// - If the final amount is zero, thank the user for their payments
			- If the final amount is less than zero, thank the user for their payment and display their overpayment
	*/
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static DecimalFormat df1 = new DecimalFormat("#.#");

	public static void main(String[] args) {
		
		/*
		// 1. Read data from a CSV file
		// 2. Open file
		// 3. Read data as long is it is not empty
		// 4. Parse the data by commas
		// 5. Add the data (line) to the collection (data)
		*/

		double balance = 0;
		
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Java-nh\\Files\\AssignmentDataCollections.csv";
		File file = new File(filename);		
		String dataLine;
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			while((dataLine = reader.readLine()) != null){
				String[] line = dataLine.split(",");
				data.add(line);
			}
			reader.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		System.out.println(" | DATE  | TYPE    | AMOUNT    | ACTION    | Balance");
		System.out.println(" +-------+---------+-----------+-----------+-------------+");
		for(String[] acctLine : data) {
			for(int i = 0; i < acctLine.length; i++){
				if(acctLine[i].equals("CREDIT")) {
					double creditAmt = Double.parseDouble(acctLine[i+2]);
					balance += creditAmt;
					String displayCredit = df1.format(creditAmt);
					System.out.print(" | " + acctLine[i-1]);
					System.out.print(" | CREDIT ");
					System.out.print(" |  " + acctLine[i+2]);
					System.out.print("   |  +$" + displayCredit);
					System.out.print("    |  $" + df2.format(balance));
				} else if(acctLine[i].equals("DEBIT")){
					double debitAmt = Double.parseDouble(acctLine[i+2]);
					balance -= debitAmt;
					System.out.print(" | " + acctLine[i-1]);
					System.out.print(" | DEBIT  ");
					System.out.print(" |    " + acctLine[i+2]);
					System.out.print("   |  -$" + debitAmt);
					System.out.print("    |  $" + df2.format(balance));
				}else if(acctLine[i].equals("FEE")){
					double feeAmt = Double.parseDouble(acctLine[i+2]);
					balance += feeAmt;
					System.out.print(" | " + acctLine[i-1]);
					System.out.print(" | FEE    ");
					System.out.print(" |    " + acctLine[i+2]);
					System.out.print("   |  +$" + feeAmt);
					System.out.print("    |  $" + df2.format(balance));
				}
			}
			System.out.println("  ");
		}
//		System.out.println(" +---------+-----------+-----------+------------+");
		System.out.println(" ");
		
		if(balance > 0) {
			System.out.println("A 10% fee charged due to: $" + df2.format(balance));
			balance += balance * .10;
			System.out.println("Your revised balance: $" + df2.format(balance));
		} else if (balance == 0){
			System.out.println("Thank you for your payment");
		} else if (balance < 0){
			System.out.println("Thank you for your payment");
			System.out.println("You have an overpayment balance of $" + df2.format(balance));
		}
		
		System.out.println("\nACCOUNT BALANCE: $" + df2.format(balance));
		
	}

}

// From another student:
/* I like the logic he did with the for-each
 for (String[] data : Credits) {

            System.out.print("[");

            for (String ActualData : data) {

                if (ActualData.matches("CREDIT") || ActualData.matches("FEE")) {

                    balance += Double.valueOf(data[3]);

                } else if (ActualData.matches("DEBIT")) {

                    balance -= Double.valueOf(data[3]);
                }
                System.out.print(ActualData + " ");


            }

            System.out.println(" ] $" + balance);

        }

        if (balance > 0) {

            balance *= 1.10;

            System.out.println("WARNING: A 10% charge has been added to you account \n Balance: $" + balance);

        } else if (balance == 0) {

            System.out.println("Thank you for the payment. Balance: $" + balance);

        } else if (balance < 0) {

            System.out.println("Thank you for the payment. Remaining Balance: (OVERPAY) $" + balance);


        } 
*/

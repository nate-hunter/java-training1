package exceptionsfiles;

import java.util.Scanner;
import java.io.*;

public class PaymentsApp {

	// Take a payment from a user
	public static void main(String[] args) throws IOException {
		// 1. Ask the user for input
		// 2. Get the amount and test the value
		// 3. Handle exceptions appropriately
		// 4. Print confirmation

		double payment = 0;
		boolean posPayment = true;
		
		
		do {	
			// -1-
			System.out.print("Enter the payment amount: ");

			// -2-
			Scanner in = new Scanner(System.in);
	
			// -3-
			try {
				payment = in.nextDouble();
				if(payment < 0){
					// throw error;
					throw new NegativePaymentException(payment);
				} else if (payment > 0) {
					posPayment = true;
				}
			} catch(NegativePaymentException e) { // catch exception
				System.out.println(e.toString());
				System.out.println("Please try again");
				posPayment = false;
			}
		} while(!posPayment);
		
		// -4-
		System.out.println("Thank you for your payment of: $" + payment);
		
		
		
		
//		int amount = in.nextInt();
//		System.out.println("Scanner // " + (amount + 5));
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String str = reader.readLine();
//		System.out.println("BufferedReader // " + str);
	}

}

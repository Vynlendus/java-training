package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	// Take a payment from the user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		
		do {
			// 1. Ask the user for input
			System.out.print("Enter the payment amount: ");
			// 2. Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if(payment < 0) { 
					throw new NegativePaymentException(payment);
				} else {
					positivePymt = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				positivePymt = false;
			}
		} while(!positivePymt);
		
		// 4. Print the confirmation.
		
		System.out.println("Thank you for your payment of $" + payment);

	}

}

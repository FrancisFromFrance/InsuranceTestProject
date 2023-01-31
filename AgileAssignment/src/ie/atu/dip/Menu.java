
package ie.atu.dip;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	int age;
	int accidents;
	int basicInsurance = 500;
	int surcharge = 100; // under 25 years

	public int AgeChooser(Scanner sc) { 

		age = sc.nextInt();

		if (age < 25) {
			basicInsurance += surcharge;
			System.out.println("Additional surcharge " + surcharge);
		} else if (age >= 25) {
			System.out.println("No additional surcharge");
		}
		wait2seconds();

		return age;

	}

	//This method is to make the console more user friendly by waiting between inputs
	private void wait2seconds() {
		try {
			System.out.println("\nPlease Wait..\n");
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	//This method lets the user input how much accidents they had
	public int NumofAccidents(Scanner sc) {
		accidents = sc.nextInt();
		
		switch (accidents) {
		case 0:
			System.out.println("No surcharge");
			System.out.println("Total amount to pay: " + basicInsurance);
			break;
		case 1:
			System.out.println(
					"Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50)); // Pay
																														// 650
			break;
		case 2:
			System.out.println(
					"Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125)); // Pay
																														// 725
			break;
		case 3:
			System.out.println(
					"Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225)); // Pay
																														// 825
			break;
		case 4:
			System.out.println(
					"Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375)); // Pay
																														// 975
			break;
		case 5:
			System.out.println(
					"Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575)); // Pay
																														// 1175
			break;
		}

		if (accidents > 6)
			System.out.println("No insurance");
		wait2seconds();
	
		return accidents;

	}

	//This method adds a bit of style to the menu
	public void start() throws IOException {

		System.out.println("***************************************************");
		System.out.println("*                                                 *");
		System.out.println("*           Insurance Calculator Started          *");
		System.out.println("*     H.Dip in Science (Software Development)     *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		System.out.println("\n");


	}

}


package lab01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author clitus dmonte
 *
 */
public class AccountHolderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice = 0;
		Boolean check = false;
		Scanner sc;
		Double amount;
		try {

			// Get the starting account balance.
			do {
				sc = new Scanner(System.in);
				System.out.print("Enter your account's starting balance.");
				amount = sc.nextDouble();
				if (amount < 0) {
					System.out.println("Starting account balance can not be negative\n");
					

				}
			} while (amount < 0);
			// Create a AccountHolder object.

			AccountHolder accountHolder = new AccountHolder(amount);

			// Initially setting interest rate to 4%
			accountHolder.modifyMonthlyInterest(0.04);

			// Choices Menu.
			do {
				System.out.println("\n\n***************************************");
				System.out.println("Welcome to IIT-C Bank");
				System.out.println("***************************************");
				System.out.println("1) Deposit. ");
				System.out.println("2) Withdraw. ");
				System.out.println("3) Check your Balance. ");
				System.out.println("4) Interests Computations for 12 Months. ");
				System.out.println("5) Change Rate of Interest. ");
				System.out.println("6) Interest Computation for a Month. ");
				System.out.println("7) Application Details. ");
				System.out.println("***************************************");
				System.out.print("Enter your choice :  ");
				System.out.flush();
				try {
					choice = sc.nextInt();

					switch (choice) {
					case 1: // To Deposit.
						// Get the amount to Deposit.
						amount=null;
						do {
						System.out.print("\nHow much $ would you like to make deposit?\n");
						amount=sc.nextDouble();
						if(amount<0){
							System.out.println("Amount to be deposited account can not be negative");	
						}
						}while(amount<0);
						accountHolder.deposit(amount);
						break;
					case 2: // To Withdraw.
						// Get the amount to Withdraw.
						amount=null;
						do{
						System.out.print("\nHow much would you like to withdraw?\n");
						amount=sc.nextDouble();
						if(amount<0){
							System.out.println("Amount to be withdrawn account can not be negative");	
						}
						}while(amount<0);
						accountHolder.withdrawal(amount);
						break;
					case 3: // To Check your Balance.
						System.out.println("\nYour balance is " + accountHolder.toString());
						break;
					case 4: // For Interests Computations for 12 months .
						accountHolder.interestCalculations();
						break;
					case 5: // To Change Rate of Interest.
						System.out.println(
								"\nPlease enter Rate of interest to be updated.\nNote Rate of Interest must be greater than or equal to 0 and less then or equal to 1.0.");
						accountHolder.modifyMonthlyInterest(sc.nextDouble());
						break;
					case 6: // To Calculate Interest for a month.
						accountHolder.monthlyInterest();
						System.out.println("\nCalculating monthly interest with interest rate set to : "
								+ accountHolder.getAnnualInterestRate());
						System.out.println("Balances:");
						System.out.println("Account Balance with Interest \n");
						System.out.println("Balance : " + accountHolder.toString());
						break;
					case 7: // Application Details
						System.out.println("\n.. Application Details ..\n        IITC BANK\n");
						String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
								.format(Calendar.getInstance().getTime());
						System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Clitus Dmonte\n");
						break;
					default:
						System.out.println("\n Invalid Choice \n");
					}
				} catch (NullPointerException e) {
					System.err.println("Transaction Cancelled \n" + e);
				}

				System.out.println("Do you wish to continue? (y/n)");
				String op = sc.next();
                //condition to check if you want to exit application
				check = op.equalsIgnoreCase("y") ? true : false;

				if (!check) {
					System.out.println("\nThank-You for using  IITC BANK.");
					String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
							.format(Calendar.getInstance().getTime());
					System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Clitus Dmonte\n");
				}

			} while (check);

			System.exit(0);
		} catch (Exception e) {
			System.err.println("Transaction Cancelled \n" + e);
		}

	}
}

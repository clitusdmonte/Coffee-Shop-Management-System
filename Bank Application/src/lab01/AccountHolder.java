
package lab01;

/**
 * AccountHolder.java class contains field members and data methods to allow
 * transaction processing for a Banks Account Holder.
 * 
 * @author clitus dmonte
 *
 */
public class AccountHolder {

	private static double annualInterestRate;
	private double balance;


	/**
	 * Getter method for Field annualInterestRate
	 * 
	 * @return the annualInterestRate
	 */
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Accept initial balance for the Account holder.
	 * 
	 * @param initialBalance
	 */
	public AccountHolder(double initialBalance) {
		try {
			if (initialBalance > 0) {
				this.balance = initialBalance;
				System.out.println("Opening Acc Balance: " + toString());
			} else {
				System.out.println("Balances cannot start off negative!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Deposits into Account Holder.
	 * 
	 * @param depositAmount
	 */
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("\nAmount Deposited : " + depositAmount + " Total Balance : " + toString());
	}

	/**
	 * Withdraws from Account Holder.
	 * 
	 * @param withdrawalAmount
	 */
	public void withdrawal(double withdrawalAmount) {
		double tempBalance;
		boolean flag = false;
		tempBalance = this.balance - withdrawalAmount;
		try {
			/*
			 * Withdrawal check condition 1 i.e. Do not allow withdraw to
			 * decrease the holder’s balance below $100.
			 */
			if (tempBalance >= 150) {
				this.balance = tempBalance;
				flag = true;
			} else {
				System.out.println("\nWithdrawal Denied as withdraw amount decreases the holder’s balance below $100.\n");
			}
			/*
			 * Withdrawal check condition 2 i.e. b. If a withdrawal allows the
			 * account balance to drop below $500, a transaction fee of $50 will
			 * be deducted.
			 */
			if (tempBalance < 500 && flag) {
				this.balance -= 50;

				System.out.println(
						"\nBalance dropped below 500 $ hence transaction fees of 50 $ is charged. Updated balance : "
								+ toString() + "$");
			}
			if (flag) {
				System.out.println("\nWithdrawal Amount : " + withdrawalAmount + " Updated Balance : " + toString());
			}

		} catch (Exception e) {
			System.err.println("Transaction Cancelled" + e);
		}

	}

	/**
	 * Calculates Monthly Interest.
	 */
	public void monthlyInterest() {
		this.balance += this.balance * (this.annualInterestRate / 12.0);
	}

	/**
	 * Modifies or Updates Monthly Interest Rate.
	 * 
	 * @param rateUpdate
	 */
	public void modifyMonthlyInterest(double rateUpdate) {
		try {
			// Checks valid rate that is greater than or equal to 0 and less
			// then or equal to 1.0.
			if (rateUpdate >= 0 && rateUpdate <= 1.0) {
				this.annualInterestRate = rateUpdate;
				System.out.println("\nInterest Rate has been updated to : "+rateUpdate);
			} else {
				System.out.println("Invalid monthly rate of interest ");
			}
		} catch (Exception e) {
			System.err.println("Transaction Cancelled" + e);
		}
	}

	/**
	 * Formats and returns Account Balance
	 */
	public String toString() {
		return String.format("$%.2f", this.balance);
	}

	/**
	 * Calculates Interest for Users Account Balance.
	 */
	public void interestCalculations() {
		// Interest for the bank to be initially set at 4%.
		modifyMonthlyInterest(0.04);
		System.out.println("\nMonthly balance for one year at 0.04");
		System.out.println("Balances:");
		System.out.println("Account Balance with Interest \n");
		System.out.println("Balance  : " + toString());
		// for loop to show Interest being added to the users account over a
		// period of 12 months.
		for (int i = 1; i <= 12; i++) {
			monthlyInterest();
			System.out.println("Month " + i +" \t"+ " : " + toString());
		}
	}

}

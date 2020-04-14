package oops_Concepts;

public class Bank_Account {

	private long acctNumber;
	private String acctName;
	private double acctBalance;
	
	public void deposit(double amt) {
		if ( amt>0 ) {
			acctBalance = acctBalance + amt;
			System.out.println("Successfully deposited amount " +amt);
		}else {
			System.out.println("Cannot deposit " +amt);
		}
	}
	
	public void withdraw(double amt) {
		if ( amt>0 ) {
			acctBalance = acctBalance - amt;
			System.out.println("Successfully withdrawn amount " +amt);
		}else {
			System.out.println("Cannot withdraw " +amt);
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Your current balance is rupees " + acctBalance);
	}
	
	public Bank_Account(long acctNumber, String acctName, double acctBalance) {
		this.acctNumber = acctNumber;
		this.acctName = acctName;
		this.acctBalance = acctBalance;
	}
}

package oops_Concepts;

public class BankAccount_Main {

	public static void main(String[] args) {
		
		Bank_Account ba1 = new Bank_Account(123645,"Pooja",28900 );
		ba1.deposit(1000);
		ba1.withdraw(100);
		ba1.displayCurrentBalance();
		
		ba1.deposit(-100);
		ba1.displayCurrentBalance();
		
		ba1.deposit(20000); 
		ba1.displayCurrentBalance();
	}

}

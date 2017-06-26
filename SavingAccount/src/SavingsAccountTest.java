
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);
		
		SavingAccount.modifyInterestRate(4);
		System.out.printf("The new balance for Saver 1 is: %.2f%n", saver1.calculateMonthlyInterest());
		System.out.printf("The new balance for Saver 2 is: %.2f%n", saver2.calculateMonthlyInterest());
		
		SavingAccount.modifyInterestRate(5);
		System.out.printf("The new balance for Saver 1 is: %.2f%n", saver1.calculateMonthlyInterest());
		System.out.printf("The new balance for Saver 2 is: %.2f%n", saver2.calculateMonthlyInterest());
		
		
	}

}


public class SavingAccount {
	
	private static double interestRate;
	private double savingsBalance;
	
	public SavingAccount(double amount){
		savingsBalance = amount;
	}
	
	public static void modifyInterestRate(double newInterestRate){
		interestRate = newInterestRate;
	}
	
	public double calculateMonthlyInterest(){
		savingsBalance += ((savingsBalance * (interestRate / 100)) / 12);
		return savingsBalance;
	}
	
	
}

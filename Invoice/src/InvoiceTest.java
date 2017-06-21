import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Invoice invoice1 = new Invoice("NA12123", "Brake Pad", 4, 14.99);
		Invoice invoice2 = new Invoice("NA13873", "Brake Rotor", 2, 29.99);
		Invoice invoice3 = new Invoice("NA18273", "Brake Caliper", 2, 39.99);
		
		double total = invoice1.getInvoiceAmount() + invoice2.getInvoiceAmount() + invoice3.getInvoiceAmount();
		
		System.out.printf("Your before tax total is: %.2f \n", total);
		System.out.print("Enter rebate percent: ");
		double rebate = scan.nextDouble();
		
		total -= total * (rebate/100);
		
		System.out.printf("Your new total is: %.2f \n", total);
	}

}

import java.util.Scanner;

public class CalculatingSales {

	public static void main(String[] args) {
		
		boolean endOfData = false;
		double total = 0;
		
		Scanner scan = new Scanner(System.in);	
		
		while (endOfData != true){
			System.out.print("Enter a product number. If you are done enter y: ");
			String productNumber = scan.next();
			if (productNumber.equalsIgnoreCase("y")){
				endOfData = true;
				break;
			}
			
			System.out.print("Enter a quantity: ");
			int quantity = scan.nextInt();
			double price;
			
			switch (Integer.parseInt(productNumber)){
			
			case 1:
				price = 2.98;
				total += price * quantity;
				break;
			case 2:
				price = 4.50;
				total += price * quantity;
				break;
			case 3:
				price = 9.98;
				total += price * quantity;
				break;
			case 4:
				price = 4.49;
				total += price * quantity;
				break;
			case 5:
				price = 6.87;
				total += price * quantity;
			}
		}
		
		System.out.printf("The total is: %.2f", total);
	}
}

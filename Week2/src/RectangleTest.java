import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("The perimeter for rect is: %.2f%n", rect.calulatePerimiter());
		
		System.out.print("Enter a new length between 0 and 20: ");
		double length = scan.nextDouble();
		rect.setLength(length);
		
		System.out.print("Enter a new width between 0 and 20: ");
		double width = scan.nextDouble();
		rect.setWidth(width);
		
		System.out.printf("The perimeter for rect is: %.2f", rect.calulatePerimiter());
	}

}

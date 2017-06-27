import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your first string: ");
		String string1 = scan.next();
		System.out.print("Enter your second string: ");
		String string2 = scan.next();
		
		int compare = string1.compareTo(string2);
		
		if(compare < 0)
			System.out.println("String 1 is less than string 2");
		
		if(compare == 0)
			System.out.println("String 1 is equal to string 2");

		if(compare > 0)
			System.out.println("String 1 is greater than string 2");
	}

}

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a 5 digit number: ");
		String number = scan.nextLine();
		
		char[] palindrome = new char[5];
		boolean isPalindrome = true;
		
		if (number.length() == 5){
			for (int counter = 0; counter < 5; counter++){
				palindrome[counter] =  number.charAt(counter);
			}			
			int check = 4;
			for (int counter = 0; counter < 2; counter++){
				if (palindrome[counter] == palindrome[check]){
					check--;
				} else {
					isPalindrome = false; 
					break;
				}
			}
		} else{
			System.out.println("The number you entered is more than 5 digits.");
		}
		
		if (isPalindrome == true){
			System.out.println("You entered a palindrome.");
		} else {
			System.out.println("You did not enter a palindrome.");
		}
	}

}

import java.util.Scanner;

public class Upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
	}

}

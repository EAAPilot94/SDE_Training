import java.util.Scanner;

public class Tokenizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		String[] tokens = sentence.split(" ");
		
		for (String token : tokens)
			System.out.println(token);
	}

}

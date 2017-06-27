import java.util.Scanner;

public class Tokenizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		String[] tokens = sentence.split(" ");
		
		int b = tokens.length - 1;
		for(int i = tokens.length - 1; i ==0; i--){
			System.out.println(tokens[i]);
		}
		
		for (String token : tokens)
			System.out.println(token);
	}

}

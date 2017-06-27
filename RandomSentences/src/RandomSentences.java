import java.security.SecureRandom;

public class RandomSentences {

	public static void main(String[] args) {
		
		String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		SecureRandom rand = new SecureRandom();
		StringBuilder buffer = new StringBuilder();
		
		int picker;
		for(int i = 1; i <= 20; i++){
			//pick from the article array
			picker = rand.nextInt(4);
			buffer.append(article[picker]);
			buffer.append(" ");
			char begin = buffer.charAt(0);
			
			//replaces first letter with a capital letter
			if(begin == 't')
				buffer.replace(0, 1, "T");
			if(begin == 'a')
				buffer.replace(0, 1, "A");
			if(begin == 'o')
				buffer.replace(0, 1, "O");
			if(begin == 's')
				buffer.replace(0, 1, "S");
			
			//pick from the noun array
			picker = rand.nextInt(4);
			buffer.append(noun[picker]);
			buffer.append(" ");
			
			//pick from the verb array
			picker = rand.nextInt(4);
			buffer.append(verb[picker]);
			buffer.append(" ");
			
			//pick from the preposition array
			picker = rand.nextInt(4);
			buffer.append(preposition[picker]);
			buffer.append(" ");
			
			//pick from the article array
			picker = rand.nextInt(4);
			buffer.append(article[picker]);
			buffer.append(" ");
			
			//pick from the noun array
			picker = rand.nextInt(4);
			buffer.append(noun[picker]);
			buffer.append(".");
			
			System.out.println(buffer);
			buffer.delete(0, 100);
		}
	}

}

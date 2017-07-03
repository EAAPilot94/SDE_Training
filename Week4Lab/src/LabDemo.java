import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Programmer: Jonah Berg
 * 
 * Date: 6/19/2017 1:20pm
 */

public class LabDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of performers: ");
		int numOfPerformers = input.nextInt();

		System.out.print("Enter number of vocalists: ");
		int numOfVocalists = input.nextInt();
		
		System.out.print("Enter number of dancers: ");
		int numOfDancers = input.nextInt();
		
		int id = 1;
		List<Performer> performers = new ArrayList<Performer>();
		
		//for loop to create performer object
		for(int counter = 1; counter <= numOfPerformers; counter++){
			performers.add(new Performer(id));
			System.out.println("Performer audition created");
			
			id++;
		}//end of loop for performers
		
		//for loop to create a Vocalist object 
		for(int counter = 1; counter <= numOfVocalists; counter++){
			System.out.print("Please enter the key the vocalist sings in: ");
			String key = input.next();
			System.out.print("Please enter the volume you would like the vocalist to sing in. If none, enter 0: ");
			int volume = input.nextInt();
			performers.add(new Vocalist(id, key, volume));
			System.out.println("Vocalist audition created");
			
			id++;
		} //end for loop for vocalists
		
		
		//for loop to create performer object
		for(int counter = 1; counter <= numOfDancers; counter++){
			System.out.print("Enter the style the dancer dances: ");
			String style = input.next();
			performers.add(new Dancer(id, style));
			System.out.println("Dancer audition created");
			
			id++;
		}//end of loop for performers
		
		for(int counter = 0; counter <= performers.size() - 1; counter++){
			System.out.println(performers.get(counter).toString());
		}
	}
}


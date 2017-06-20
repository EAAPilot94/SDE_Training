/*
 * Programmer: Jonah Berg
 * 
 * Date: 6/19/2017 12:20 pm
 */
public class Performer {
	
	private int id;
	
	Performer(int id){
		this.id = id;
	}
	
	public int getID(){
		return id;
	}
	
	public String toString(){
		return id + " - Performer";
	}
}

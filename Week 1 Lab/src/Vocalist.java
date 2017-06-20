/*
 * Programmer: Jonah Berg
 * 
 * Date: 6/19/2017 12:35pm
 */
public class Vocalist extends Performer{

	private String key;
	private int volume;
	
	Vocalist(int id, String key, int volume){
		super(id);
		this.key = key;
		this.volume = volume;
	}
	
	public String getKey(){
		return key;
	}

	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	public String toString(){
		if (volume != 0)
			return "I sing in the key of - " + key + " - at the volume " + volume + " - " + super.getID();
		else 
			return "I sing in the key of - " + key + " - " + super.getID();
	}
}

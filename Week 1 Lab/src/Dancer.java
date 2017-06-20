/*
 * Programmer: Jonah Berg
 * 
 * Date: 6/19/2017 12:28pm
 */
public class Dancer extends Performer{
	
	private String style;
	
	Dancer(int id, String style){
		super(id);
		this.style = style;
	}
	
	public String getStyle(){
		return style;
	}
	
	public String toString(){
		return style + " - " + super.getID() + " - Dancer";
	}
}

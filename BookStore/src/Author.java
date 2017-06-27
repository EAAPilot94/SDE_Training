
public class Author {
	
	private String firstName;
	private String lastName;
	private String city;
	
	public Author(String firstName, String lastName, String city){
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	@Override
	public String toString(){
		return getFirstName() + " " + getLastName() + " is from " + getCity();
	}

}

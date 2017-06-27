
public class Employee {
	
	private final String firstName;
	private final String lastName;
	private final String social;
	private final String birthday; 
	
	public Employee(String firstName, String lastName, String social, String birthday){
		this.firstName = firstName;
		this.lastName = lastName;
		this.social = social;
		this.birthday = birthday;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getSocial(){
		return social;
	}
	
	public String getBirthday(){
		return birthday;
	}
}

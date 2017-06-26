
public class Employee {
	
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;
	
	public Employee(String firstName, String lastName, int socialSecurityNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setSocial(int social){
		this.socialSecurityNumber = social;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getSocial(){
		return socialSecurityNumber;
	}
}

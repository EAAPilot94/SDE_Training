
public class SalariedEmployee extends Employee{
	
	private double salary;
	
	public SalariedEmployee(String firstName, String lastName, String social, String birthday, double salary){
		super(firstName, lastName, social, birthday);
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double newSalary){
		this.salary = newSalary;
	}
	
	public String toString(){
		return "Name: " + getFirstName() + " " + getLastName() + "\nSocial: " + getSocial() + "\nSalary: "
				+ getSalary();
	}
}

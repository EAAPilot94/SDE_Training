
public class HourlyEmployee extends Employee{
	
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, 
			int social, double hourlyWage, double hoursWorked){
		super(firstName, lastName, social);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public void setHourlyWage(double newHourlyWage){
		if(newHourlyWage > 0)
			hourlyWage = newHourlyWage;
	}
	
	public void setHoursWorked(double hoursWorked){
		if(hoursWorked >= 0 && hoursWorked <= 168)
			this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyWage(){
		return hourlyWage;
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public double earnigns(){
		return hoursWorked * hourlyWage;
	}
	
	@Override
	public String toString(){
		return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() 
		+ "\nSocial Security Number: " + getSocial() + "\nHours Worked: " + getHoursWorked()
		+ "\nHourly Wage: " + getHourlyWage() + "\nEarnings: " + earnigns();
	}

}

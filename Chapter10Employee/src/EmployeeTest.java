
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee sal1 = new SalariedEmployee("Jonah", "Berg", "123", "11-16-1994", 123123.00);
		SalariedEmployee sal2 = new SalariedEmployee("Rosa", "Berg", "123", "10-16-1994", 62.00);
		SalariedEmployee sal3 = new SalariedEmployee("Jensen", "Berg", "123", "1-16-1994", 4230.00);
		
		Employee[] emp = new Employee[3];
		emp[0] = sal1;
		emp[1] = sal2;
		emp[2] = sal3;
		
		for (Employee current : emp){
			System.out.println(current);
			
			if (current.getBirthday().substring(1, 3).equals("11")){
				SalariedEmployee salEmployee = (SalariedEmployee) current;
				
				salEmployee.setSalary(salEmployee.getSalary() * 1.25);
			}
			System.out.println(current);	
		}
	}
}

import java.util.Scanner;

public class ConstructorException {
	
	private int age;
	private String name;
	
	public ConstructorException(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int newAge = scan.nextInt();
		System.out.print("Enter your name: ");
		String name = scan.next();
		
		try{
			if(newAge < 0 || newAge >= 110){
				throw new IllegalArgumentException();
			}
			ConstructorException exc = new ConstructorException(newAge, name);
		}
		catch (Exception exception){
			System.out.println("Age must be between 1 and 110");
			System.out.println(exception.getStackTrace());
			System.out.println(exception.getMessage());
		}
		
	}
}

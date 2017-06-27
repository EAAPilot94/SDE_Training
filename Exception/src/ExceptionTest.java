
public class ExceptionTest {

	public static void main(String[] args) {

		int int1 = 3;
		int int2 = 0;
		
		try{
			int newInt = int1 / int2;
		}
		catch (Exception exception){
			System.out.println(exception.getMessage());
		}

	}

}

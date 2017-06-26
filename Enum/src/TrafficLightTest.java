import java.util.EnumSet;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (TrafficLight light : TrafficLight.values())
			System.out.printf("The light is %s and the duration is %d%n", light, light.getDuration());

	}

}

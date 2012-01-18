/**
 * This is very simple Traffic Monitor program to demonstrate the use of dependancy(Observer-Observable)
 * Concurrency is not considered 
 * @author Chalitha Udara
 *
 */
public class TrafficTest {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		Vehicle car = new Car(trafficLight);
		Vehicle bus = new Bus(trafficLight);

		for (int i = 0; i < 5; i++) {
			trafficLight.changeLight();
			for (int j = 0; j < 500; j++)
				;
		}
	}

}

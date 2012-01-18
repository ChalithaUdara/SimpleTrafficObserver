/**
 * 
 * @author ChalithaUdara
 *
 */
import java.util.Observable;

public class Car extends Vehicle {

	public Car(Observable observable) {
		super(observable);
	}

	public void drive() {
		System.out.println("Car is driving");
	}

	public void stop() {
		System.out.println("Car has stopped");
	}

	public void slowDown() {
		System.out.println("Car is slowing down");
	}

}

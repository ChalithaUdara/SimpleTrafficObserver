import java.util.Observable;

/**
 * 
 * @author ChalithaUdara
 * 
 */
public class Bus extends Vehicle {

	public Bus(Observable observable) {
		super(observable);
	}

	public void drive() {
		System.out.println("Bus is driving");
	}

	public void stop() {
		System.out.println("Bus has stopped");
	}

	public void slowDown() {
		System.out.println("Bus is slowing down");
	}

}

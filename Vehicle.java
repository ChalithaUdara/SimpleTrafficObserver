/**
 * 
 * @author ChalithaUdara
 *
 */
import java.util.*;

public abstract class Vehicle implements Observer {
	protected Observable observable;

	public Vehicle(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public abstract void drive();

	public abstract void stop();

	public abstract void slowDown();

	public void takeAction(String color) {
		if (color.equals("Red"))
			this.stop();
		else if (color.equals("Green"))
			this.drive();
		else if (color.equals("Amber"))
			this.slowDown();
	}

	public void update(Observable obs, Object args) {
		if (obs instanceof TrafficLight) {
			TrafficLight trafficLight = (TrafficLight) obs;
			String color = trafficLight.getColor();
			this.takeAction(color);
		}
	}
}

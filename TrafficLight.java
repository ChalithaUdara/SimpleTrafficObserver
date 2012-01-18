/**
 * 
 * @author ChalithaUdara
 *
 */
import java.util.*;

public class TrafficLight extends Observable {
	private ArrayList<Light> lights;
	private String currentLight;

	public TrafficLight() {
		lights = new ArrayList<Light>();
		lights.add(new RedLight());
		lights.add(new GreenLight());
		lights.add(new AmberLight());
	}

	public void changeLight() {
		Random generator = new Random();
		int prev = 0;
		int current = generator.nextInt(lights.size());
		this.lights.get(prev).turnOff();
		this.lights.get(current).turnON();
		currentLight = lights.get(current).getColor();
		this.LightChanged();
	}

	public void LightChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor() {
		return currentLight;
	}
}

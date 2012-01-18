/**
 * 
 * @author ChalithaUdara
 * 
 */
public class GreenLight implements Light {

	public void turnON() {
		System.out.println("Green Light is on");
	}

	public void turnOff() {
		System.out.println("Green light is turned off");
	}

	public String getColor() {
		return "Green";
	}
}

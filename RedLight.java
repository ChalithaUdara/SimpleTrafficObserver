/**
 * 
 * @author ChalithaUdara
 * 
 */
public class RedLight implements Light {

	public void turnON() {
		System.out.println("Red Light is on");
	}

	public void turnOff() {
		System.out.println("Red light is turned off");
	}

	public String getColor() {
		return "Red";
	}
}

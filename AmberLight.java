/**
 * 
 * @author ChalithaUdara
 * 
 */
public class AmberLight implements Light {

	public void turnON() {
		System.out.println("Amber Light is on");
	}

	public void turnOff() {
		System.out.println("Amber light is turned off");
	}

	public String getColor() {
		return "Amber";
	}
}

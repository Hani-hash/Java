
public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	
	}
	public String Ring() {
		return this.getRingTone();
	}
	
	public String unlock() {
		return "unlock your phone";
	}
	
	public void displayInfo () {
		  System.out.println("Version Number: " + this.getVersionNumber());
	      System.out.println("Batter Percentage: " + this.getbatteryPercentage());
	      System.out.println("Carrier: " + this.getcarrier());
	      System.out.println("RingTone: " + this.getRingTone());
	}
}

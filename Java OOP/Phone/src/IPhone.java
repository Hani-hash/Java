
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String Ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlock your phone";
    }	
   
    @Override
    public void displayInfo() {
        System.out.println("Version number:" + this.getVersionNumber());
        System.out.println("Battery" + this.getbatteryPercentage());
        System.out.println("Carrier" + this.getcarrier());
        System.out.println("Ring Tone" + this.getRingTone());
        
    }
}

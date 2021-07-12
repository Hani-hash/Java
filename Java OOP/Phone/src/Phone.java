
public abstract class Phone {
	    private String versionNumber;
	    private int batteryPercentage;
	    private String carrier;
	    private String ringTone;
	    
	    
	    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
	        this.versionNumber = versionNumber;
	        this.batteryPercentage = batteryPercentage;
	        this.carrier = carrier;
	        this.ringTone = ringTone;
	    }
	    
	    public String getRingTone() {
	        return this.ringTone;
	    }
	    
	    public int getbatteryPercentage() {
	    	return this.batteryPercentage;
	    }
	    
	    public String getcarrier() {
	    	return this.carrier;
	    }
	    
	    public String ringTone() {
	    	return this.ringTone;
	    }
	    
	    public String getVersionNumber() {
	        return this.versionNumber;
	    }
	    // abstract method. This method will be implemented by the subclasses
	    public abstract void displayInfo();
	    
	}


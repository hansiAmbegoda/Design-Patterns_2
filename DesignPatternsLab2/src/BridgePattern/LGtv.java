package BridgePattern;

public class LGtv implements TV{
	public void on() {
		System.out.println("Switch on LGTV");
	}
	
	public void off() {
		System.out.println("Switch off LGTV");
	}
	
	public void tune (int channel) {
		System.out.println("Channel " + channel);
	}
}

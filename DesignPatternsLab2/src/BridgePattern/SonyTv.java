package BridgePattern;

public class SonyTv implements TV{

	@Override
	public void on() {
		System.out.println("Switch on Sony TV");
	}

	@Override
	public void off() {
		System.out.println("Switch off Sony TV");
	}

	@Override
	public void tune(int channel) {
		System.out.println("Channel " + channel);
	}
	
}

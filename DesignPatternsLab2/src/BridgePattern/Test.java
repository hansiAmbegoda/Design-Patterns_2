package BridgePattern;

public class Test {
	public static void main(String[] args) {
		TV lgtv = new LGtv();
		TV sonytv = new SonyTv();
		
		new RemoteControllerImpl(lgtv).on();
		new RemoteControllerImpl(lgtv).off();
		new RemoteControllerImpl(lgtv).tune(10);
		new RemoteControllerImpl(sonytv).on();
		new RemoteControllerImpl(sonytv).off();
		new RemoteControllerImpl(sonytv).tune(5);
	}

}

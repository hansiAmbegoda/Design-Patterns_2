package Singleton;

public class TestSingleton implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new TestSingleton()).start();
		
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
			Singleton.getInstance();
		}
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
			Singleton.getInstance();
		}
	}


}

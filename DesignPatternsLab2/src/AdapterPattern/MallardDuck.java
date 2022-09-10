package AdapterPattern;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack duck Mallard");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
}

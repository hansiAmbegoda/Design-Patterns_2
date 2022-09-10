package AdapterPattern;

public class TestAdapter {

	public static void main(String[] args) {
		System.out.println("Duck Says...");
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		System.out.println("\nTurkey Says...");
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nTurkey Adapter Says...");
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}

}

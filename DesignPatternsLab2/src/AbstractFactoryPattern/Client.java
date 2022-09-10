package AbstractFactoryPattern;

public class Client {
	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		
		Shape shape1 = shapefactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapefactory.getShape("Square");
		shape2.draw();
		
		Shape shape3 = shapefactory.getShape("Rectangle");
		shape3.draw();
		
	}
}

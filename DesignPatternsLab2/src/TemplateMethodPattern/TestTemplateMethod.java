package TemplateMethodPattern;

public class TestTemplateMethod {
	
	static Beverages beverage = null;

	public static void main(String[] args) {
		Beverages tea = new Tea();
		tea.prepareRecipe();
		System.out.println("=================");
		
		Beverages coffee = new Coffee();
		coffee.prepareRecipe();
		System.out.println("=================");
		
	}

}

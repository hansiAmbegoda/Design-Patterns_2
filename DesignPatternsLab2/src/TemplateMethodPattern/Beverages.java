package TemplateMethodPattern;

abstract class Beverages {
	void prepareRecipe() {
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pour into cup");
	}

}

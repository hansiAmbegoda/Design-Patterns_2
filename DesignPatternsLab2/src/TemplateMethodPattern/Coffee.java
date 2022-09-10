package TemplateMethodPattern;

public class Coffee extends Beverages{

	@Override
	void brew() {
		System.out.println("Stripping coffie through filter.");
	}

	@Override
	void addCondiments() {
		System.out.println("Add sugar and milk.");
	}
	
}

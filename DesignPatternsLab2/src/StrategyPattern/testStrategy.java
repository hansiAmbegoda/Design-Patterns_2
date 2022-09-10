package StrategyPattern;

public class testStrategy {

	public static void main(String[] args) {
		
		Students poStudents = new PostGraduateStudents();
		poStudents.offerPrograms();
		poStudents.conductEvents();
		poStudents.displayStudents();
		
		System.out.println("\n==========Assign new event==========");
		poStudents.setFestival(new CodeFest());
		poStudents.conductEvents();
		
		System.out.println("\n==============================");
		
		Students unStudents = new UndergraduateStudents();
		unStudents.offerPrograms();
		unStudents.conductEvents();
		unStudents.displayStudents();
		
		System.out.println("\n==========Assign new event==========");
		unStudents.setPrograms(new MScPrograms());
		unStudents.offerPrograms();
	}

}

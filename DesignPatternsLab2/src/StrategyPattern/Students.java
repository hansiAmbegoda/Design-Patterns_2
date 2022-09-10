package StrategyPattern;

public abstract class Students {
	IPrograms iPrograms;
	IFestival iFestival;
	
	public void offerPrograms() {
		iPrograms.offerPrograms();
	}
	
	public void conductEvents() {
		iFestival.performEvent();
	}
	
	public abstract void displayStudents();
	
	public void setPrograms(IPrograms iPrograms) {
		this.iPrograms = iPrograms;
	}
	
	public void setFestival(IFestival iFestival) {
		this.iFestival = iFestival;
	}
}

package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
	
//	private ClassicalMusic() {
//		
//	}

	public void doMyInit() {
		System.out.println("Doing my initialization (Classical Music)");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction (Classical Music)");
	}
	
	@Override
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}

package ru.alishev.springcourse;

public class JazzMusic implements Music {

	public void doMyInit() {
		System.out.println("Doing my initialization (Jazz Music)");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction (Jazz Music)");
	}
	
	@Override
	public String getSong() {
		return "Sweet Jazz Music";
	}

}

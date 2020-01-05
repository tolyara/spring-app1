package ru.alishev.springcourse.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

	String[] songs = { "classic song 1", "classic song 2", "classic song 3", "classic song 4"};

	@PostConstruct
	public void doMyInit() {
		System.out.println("initialization ClassicalMusic");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("destroyClassicalMusic");
	}

	@Override
	public String getSong() {
		return "Cool Classic Music";
	}

	@Override
	public String[] getSongs() {
		return songs;
	}

}

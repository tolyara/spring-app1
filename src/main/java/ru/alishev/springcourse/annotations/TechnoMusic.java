package ru.alishev.springcourse.annotations;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements Music {

	String[] songs = { "techno song 1", "techno song 2", "techno song 3" };

	@Override
	public String getSong() {
		return "Groovy Techno Music";
	}

	@Override
	public String[] getSongs() {
		return songs;
	}

}

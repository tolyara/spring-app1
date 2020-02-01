package ru.alishev.springcourse.annotations;

import org.springframework.stereotype.Component;

@Component
//@Component("someRockMusic")
public class RockMusic implements Music {

	String[] songs = { "rock song 1", "rock song 2", "rock song 3" };

	@Override
	public String getSong() {
		return "Nice Rock Music";
	}

	@Override
	public String[] getSongs() {
		return songs;
	}

}

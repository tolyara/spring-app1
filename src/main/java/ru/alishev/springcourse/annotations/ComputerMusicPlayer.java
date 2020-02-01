package ru.alishev.springcourse.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComputerMusicPlayer {

	private Music music1;
	private Music music2;
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	@Autowired
	public ComputerMusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}

	public String playMusic() {
		return "Playing: " + music1.getSong() + ", " + music2.getSong();
	}

}

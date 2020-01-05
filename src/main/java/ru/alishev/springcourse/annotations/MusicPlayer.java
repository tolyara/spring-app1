package ru.alishev.springcourse.annotations;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class MusicPlayer {

	@Autowired
//	@Qualifier("classicalMusic")
	private Music music;

//	@Autowired
	public MusicPlayer(Music music) {
		this.music = music;
	}

//	@Autowired
	public void setMusic(Music music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

}

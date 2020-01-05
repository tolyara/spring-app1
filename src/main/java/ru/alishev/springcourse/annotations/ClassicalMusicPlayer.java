package ru.alishev.springcourse.annotations;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class ClassicalMusicPlayer {
	
	private ClassicalMusic classicalMusic;

	@Autowired
	public ClassicalMusicPlayer(ClassicalMusic classicalMusic) {
		this.classicalMusic = classicalMusic;
	}

	public void playMusic() {
		System.out.println("Playing: " + classicalMusic.getSong());
	}

}

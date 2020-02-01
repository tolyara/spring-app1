package ru.alishev.springcourse.annotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoubleMusicPlayer {

	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;

	@Autowired
	public DoubleMusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
	}

	public void playMusic() {
		System.out.println("Playing: " + classicalMusic.getSong());
		System.out.println("Playing: " + rockMusic.getSong());
	}

	public void playMusic(MusicGenre musicGenre) {
		final Random random = new Random();
		switch (musicGenre) {
		case CLASSICAL:
			final int nextRamdomNumber = random.nextInt(classicalMusic.getSongs().length);
			System.out.println(classicalMusic.getSongs()[nextRamdomNumber]);
			break;
		case ROCK:
			System.out.println(rockMusic.getSongs()[random.nextInt(rockMusic.getSongs().length)]);
			break;
		default:
			throw new RuntimeException("Error! Unknown Music Genre");
		}
	}

}

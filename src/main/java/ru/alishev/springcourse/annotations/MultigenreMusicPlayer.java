package ru.alishev.springcourse.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//homework
@Component
public class MultigenreMusicPlayer {

	private List<Music> musicList = new ArrayList<Music>();
	
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

	public MultigenreMusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}

	public String playMusic() {
		final Random random = new Random();
		final int nextRamdomNumber = random.nextInt(musicList.size());
		return musicList.get(nextRamdomNumber).getSong();
	}

}

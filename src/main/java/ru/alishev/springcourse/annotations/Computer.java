package ru.alishev.springcourse.annotations;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private int id;
	private ComputerMusicPlayer computerMusicPlayer;

//	@Autowired
	public Computer(ComputerMusicPlayer computerMusicPlayer) {
		this.id = 1;
		this.computerMusicPlayer = computerMusicPlayer;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", musicPlayerSong=" + computerMusicPlayer.playMusic() + "]";
	}

}

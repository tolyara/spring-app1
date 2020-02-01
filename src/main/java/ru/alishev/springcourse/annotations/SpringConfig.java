package ru.alishev.springcourse.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.alishev.springcourse.annotations")
@PropertySource("classpath:musicPlayer2.properties")
public class SpringConfig {
	
//	@Bean
//	public ClassicalMusic classicalMusic() {
//		return new ClassicalMusic();
//	}
//	
//	@Bean
//	public RockMusic rockMusic() {
//		return new RockMusic();
//	}
//	
//	@Bean
//	public TechnoMusic technoMusic() {
//		return new TechnoMusic();
//	}
//	
//	@Bean
//	public List<Music> musicList() {
//		return Arrays.asList(classicalMusic(), rockMusic(), technoMusic());
//	}
//	
//	@Bean
//	public MultigenreMusicPlayer multigenreMusicPlayer() {
//		return new MultigenreMusicPlayer(musicList());
//	}
//	
//	@Bean
//	public ComputerMusicPlayer computerMusicPlayer() {
//		return new ComputerMusicPlayer(rockMusic(), classicalMusic());
//	}
//	
//	@Bean
//	public Computer computer() {
//		return new Computer(computerMusicPlayer());
//	}

}

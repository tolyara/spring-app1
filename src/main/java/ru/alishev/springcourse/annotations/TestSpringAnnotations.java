package ru.alishev.springcourse.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAnnotations {

	public static void main(String[] args) {

		doLessonAutowired();

	}

	private static void doLessonIntro() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Music music = context.getBean("rockMusic", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();

		Music music2 = context.getBean("classicalMusic", Music.class);
		MusicPlayer musicPlayer2 = new MusicPlayer(music2);
		musicPlayer2.playMusic();

		context.close();

	}

	private static void doLessonAutowired() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		ClassicalMusicPlayer classicalMusicPlayer = context.getBean("classicalMusicPlayer", ClassicalMusicPlayer.class);
//		classicalMusicPlayer.playMusic();

//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();

//		DoubleMusicPlayer doubleMusicPlayer = context.getBean("doubleMusicPlayer", DoubleMusicPlayer.class);
//		doubleMusicPlayer.playMusic();

		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer);

		context.close();

	}

	private static void doLessonQualifier() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		Computer computer = context.getBean("computer", Computer.class);
//		System.out.println(computer);

		// homework
		DoubleMusicPlayer doubleMusicPlayer = context.getBean("doubleMusicPlayer", DoubleMusicPlayer.class);
		doubleMusicPlayer.playMusic(MusicGenre.CLASSICAL);
		doubleMusicPlayer.playMusic(MusicGenre.ROCK);

		context.close();

	}

	private static void doLessonScopeValue() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		ComputerMusicPlayer computerMusicPlayer = context.getBean("computerMusicPlayer", ComputerMusicPlayer.class);
//		System.out.println(computerMusicPlayer.getName());
//		System.out.println(computerMusicPlayer.getVolume());

//		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//		ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//		System.out.println(classicalMusic == classicalMusic2);

		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

		context.close();

	}

	private static void doLessonJavaCodeConfiguration() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//		ComputerMusicPlayer computerMusicPlayer = context.getBean("computerMusicPlayer", ComputerMusicPlayer.class);
//		System.out.println(computerMusicPlayer.getName());
//		System.out.println(computerMusicPlayer.getVolume());
//
//		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//		ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//		System.out.println(classicalMusic == classicalMusic2);
		
		//homework
		MultigenreMusicPlayer multigenreMusicPlayer = context.getBean("multigenreMusicPlayer", MultigenreMusicPlayer.class);
		System.out.println(multigenreMusicPlayer.playMusic());
//		System.out.println(multigenreMusicPlayer.getName());
//		System.out.println(multigenreMusicPlayer.getVolume());

		context.close();

	}

}

package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		
		doLessonBeanLifecycle();
		
	}

	private static void doTestLesson1() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		TestBean testBean2 = context.getBean("testBean2", TestBean.class);

		System.out.println(testBean.getName());
		System.out.println(testBean2.getName());
		
		context.close();

	}

	private static void doLessonIoC() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Music music = context.getBean("musicBean", Music.class);
		Music music2 = context.getBean("musicBean2", Music.class);
		
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();
		MusicPlayer musicPlayer2 = new MusicPlayer(music2);
		musicPlayer2.playMusic();
		
		context.close();

	}
	
	private static void doLessonDI_1() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);;
		musicPlayer2.playMusic();
		
		context.close();

	}
	
	private static void doLessonDI_2() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println();
		MusicPlayer musicPlayer3 = context.getBean("musicPlayer3", MusicPlayer.class);
		musicPlayer3.playMusic();
		System.out.println("player name - " + musicPlayer3.getName());
		System.out.println("volume - " + musicPlayer3.getVolume());
		System.out.println("==============================================================\n");
		MusicPlayer musicPlayer4 = context.getBean("musicPlayer4", MusicPlayer.class);;
		musicPlayer4.playMusic();
		System.out.println("player name - " + musicPlayer4.getName());
		System.out.println("volume - " + musicPlayer4.getVolume());
		System.out.println("==============================================================\n");
		
		//homework
		MultigenreMusicPlayer musicPlayer5 = context.getBean("musicPlayer5", MultigenreMusicPlayer.class);
		musicPlayer5.playMusic();
		System.out.println("player name - " + musicPlayer5.getName());
		System.out.println("volume - " + musicPlayer5.getVolume());
		
		context.close();

	}
	
	private static void doLessonBeanScope() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer6", MusicPlayer.class);
		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer6", MusicPlayer.class);
		boolean comparison = (firstMusicPlayer == secondMusicPlayer);
		
		System.out.println(firstMusicPlayer);
		System.out.println(secondMusicPlayer);
		System.out.println(comparison);
		
		firstMusicPlayer.setVolume(10);
		System.out.println(firstMusicPlayer.getVolume());
		System.out.println(secondMusicPlayer.getVolume());
		
		context.close();

	}
	
	private static void doLessonBeanLifecycle() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("111");
		ClassicalMusic classicalMusic = context.getBean("musicBean4", ClassicalMusic.class);
		System.out.println(classicalMusic.getSong());
		System.out.println("222");

		//homework
		JazzMusic jazzMusic = context.getBean("musicBean5", JazzMusic.class);
		System.out.println(jazzMusic.getSong());
		JazzMusic jazzMusic2 = context.getBean("musicBean5", JazzMusic.class);
		System.out.println(jazzMusic2.getSong());
		JazzMusic jazzMusic3 = context.getBean("musicBean5", JazzMusic.class);
		System.out.println(jazzMusic3.getSong());
		
		//factory-method
		RockMusic rockMusic = context.getBean("musicBean6", RockMusic.class);
		System.out.println(rockMusic.getSong());
		RockMusic rockMusic2 = context.getBean("musicBean6", RockMusic.class);
		System.out.println(rockMusic);
		System.out.println(rockMusic2);
		
		context.close();

	}

}

































package ru.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml");//Важно чтобы этот файл лежал в папке помеченной как resources);

        /*Music music1 = context.getBean("rockMusic",Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();

        Music music2 = context.getBean("classicMusic",Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();*/
        //ClassicalMusic classicalMusic1 = context.getBean("ClassicalMusicBean",ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("ClassicalMusicBean",ClassicalMusic.class);

        //System.out.println(classicalMusic1.getSong());
        //System.out.println(classicalMusic2.getSong());
        /*TestBean testBean = context.getBean("TestBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
        */

        //внедряем зависимости вручную
        //Music music = context.getBean("MusicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //MusicPlayer firstMusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        //MusicPlayer secondMusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        //boolean comparison = firstMusicPlayer==secondMusicPlayer;
        //firstMusicPlayer.setVolume(99);
        //System.out.println(firstMusicPlayer.getVolume()+" "+secondMusicPlayer.getVolume());
        //musicPlayer.playMusic();
        //System.out.println(comparison);
        //System.out.println(musicPlayer.getName()+" "+musicPlayer.getVolume());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        //musicPlayer.playMusic(MusicGenre.CLASSICAL);
//        System.out.println(musicPlayer.getVolume()+" "+musicPlayer.getName());
//
//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);
//        System.out.println(classicalMusic1==classicalMusic2);

        TestBean testBean = context.getBean("TestBean",TestBean.class);


        context.close();

    }
}

package ru.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    //private List<Music> musicList = new ArrayList<>();

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //public void playMusic(){
        //System.out.println(music.getSong());
    //}
    //IoC, то есть в данном случае нам не нужно создавать объекты всех типов, мы их просто передаем нужный!
    /*public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    */
    /*
    public void setMusic(Music music){
        this.music = music;
    }
*/
    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }

}

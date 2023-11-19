package train.music;

import train.music.context.SongContext;

public class Main {
    public static void main(String[] args) {
        SongContext songContext = new SongContext();

        Paused paused = new Paused();
        Playing playing = new Playing();
        Stopped stopped = new Stopped();
        songContext.setStateMusic(paused);
        songContext.request();
        songContext.setStateMusic(playing);
        System.out.println("current state: " + songContext.getStateMusic());
        songContext.request();
        songContext.setStateMusic(stopped);
        songContext.request();
         System.out.println("current state: " + songContext.getStateMusic());
    }
}

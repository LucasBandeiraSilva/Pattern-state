package train.music;

import train.music.context.SongContext;

public class Stopped implements StateMusic {

    private String stopped = "song paused";

    @Override
    public void doAction(SongContext context) {
        System.out.println(stopped);
    }

    @Override
    public String toString() {
        return "Stopped [stopped=" + stopped + "]";
    }

    
}

package train.music;

import train.music.context.SongContext;

public class Paused implements StateMusic {
    private String paused = "Song paused";

    @Override
    public void doAction(SongContext context) {
        System.out.println(paused);
        
    }

    @Override
    public String toString() {
        return "Paused [paused=" + paused + "]";
    }

    
    
    
}

package train.music;

import train.music.context.SongContext;

public class Playing implements StateMusic {

    private String music = "Taylor swift";

    @Override
    public void doAction(SongContext context) {
        System.out.println("i'm playing now: " + music);
    }

    @Override
    public String toString() {
        return "Playing [music=" + music + "]";
    }

    
    
}

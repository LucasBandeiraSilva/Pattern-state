package train.music.context;

import train.music.StateMusic;

public class SongContext {
    private StateMusic stateMusic;

    

    public StateMusic getStateMusic() {
        return stateMusic;
    }

    public void setStateMusic(StateMusic stateMusic) {
        this.stateMusic = stateMusic;
    }

    public void request(){
        stateMusic.doAction(this);
    }

    
}

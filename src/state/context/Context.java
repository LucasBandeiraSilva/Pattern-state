package state.context;

import state.State;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.doAction(this);
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Context [state=" + state + "]";
    }
    
}

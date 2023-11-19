package state;

import state.context.Context;

public class StateOff implements State {

    @Override
    public void doAction(Context contex) {
        System.out.println("It's already off");
        contex.setState(this);
    }
    
}

package state;

import state.context.Context;

public class StateOn implements State {

    @Override
    public void doAction(Context contex) {
        System.out.println("it's on already");
        contex.setState(this);
    }
    
}

package state;

import state.context.Context;

public class StateStandby implements State {

    @Override
    public void doAction(Context contex) {
        System.out.println("State Standby");
        contex.setState(this);
        
    }
    
}

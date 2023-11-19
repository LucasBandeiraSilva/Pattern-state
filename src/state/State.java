package state;

import state.context.Context;

public interface State{
    void doAction(Context contex);
}
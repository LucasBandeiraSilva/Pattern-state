package state;

import state.context.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        StateOn onState = new StateOn();
        StateOff offState = new StateOff();
        StateStandby standbyState = new StateStandby();
        context.setState(onState);
        context.request();
        context.setState(offState);
        context.request();
        context.setState(standbyState);
        context.request();
    }
}
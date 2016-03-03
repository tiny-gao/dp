package com.tinygao.dp.bridge;

public abstract class AbstractRemoteController {
    
    protected ITV itv;
    public AbstractRemoteController(ITV itv) {
        this.itv = itv;
    }
   void controllerTurnOn() {
       itv.turnOn();
   }
    void controllerTurnOff() {
        itv.turnOff();
    }
}

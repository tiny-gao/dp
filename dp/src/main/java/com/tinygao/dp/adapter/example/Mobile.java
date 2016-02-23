package com.tinygao.dp.adapter.example;

public class Mobile {
    
    private HomeVoltage v;
    
    public Mobile(HomeVoltage v) {
        super();
        this.v = v;
    }

    public void getVoltage() {
        v.sendEnergy();
    }
}

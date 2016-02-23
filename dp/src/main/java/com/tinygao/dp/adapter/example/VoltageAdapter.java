package com.tinygao.dp.adapter.example;

public class VoltageAdapter implements HomeVoltage {

    private _5VVoltage voltage;
     
    public VoltageAdapter(_5VVoltage voltage) {
        this.voltage = voltage;
    }
    
    @Override
    public void sendEnergy() {
        voltage.sendEnergy();
    }
}

package com.tinygao.dp.bridge;

public class SonyTV implements ITV{

    @Override
    public void turnOn() {
        System.out.println("sony tv turn on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("sony tv turn off");
    }

}

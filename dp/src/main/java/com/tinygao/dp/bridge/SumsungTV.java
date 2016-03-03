package com.tinygao.dp.bridge;

public class SumsungTV  implements ITV{

    @Override
    public void turnOn() {
       System.out.println("sumsung turn on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("sumsung turn off");
    }

}

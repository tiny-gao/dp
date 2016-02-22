package com.tinygao.dp.builder;

public class ThinPersonBuilder extends PersonBuilder {

    @Override
    void drawHead() {
        System.out.println("thin person head");
    }

    @Override
    void drawBody() {
        System.out.println("thin person body");
    }

    @Override
    void drawHand() {
        System.out.println("thin person hand");
        
    }

    @Override
    void drawFoot() {
        System.out.println("thin person foot");
    }

}

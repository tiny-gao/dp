package com.tinygao.dp.builder;

public class FatPersonBuilder extends PersonBuilder {

    @Override
    void drawHead() {
        System.out.println("fat person head");
    }

    @Override
    void drawBody() {
        System.out.println("fat person body");
    }

    @Override
    void drawHand() {
        System.out.println("fat person hand");
        
    }

    @Override
    void drawFoot() {
        System.out.println("fat person foot");
    }

}

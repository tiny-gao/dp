package com.tinygao.dp.template;

public class Car extends Vehicle {
    
    @Override
    void start() {
        this.status = true;
    }
 
    @Override
    void run() {
        System.out.println("Run fast!");
 
    }
 
    @Override
    void stop() {
        System.out.println("Car stop!");
    }
}
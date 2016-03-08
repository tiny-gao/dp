package com.tinygao.dp.observer;

public class Client {
    public static void main(String[] args) {
        Subject sub = new Message();
        sub.addObserver(new TinyObserver());
        sub.addObserver(new BigObserver());
        
        sub.notifyAllObservers();
    }
}

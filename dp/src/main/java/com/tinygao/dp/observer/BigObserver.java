package com.tinygao.dp.observer;

public class BigObserver implements Observer{

    @Override
    public void update(Subject sub) {
       sub.displaySubject();
    }
}

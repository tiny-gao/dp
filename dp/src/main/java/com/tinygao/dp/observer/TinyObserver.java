package com.tinygao.dp.observer;

public class TinyObserver implements Observer{

    @Override
    public void update(Subject sub) {
       sub.displaySubject();
    }

}

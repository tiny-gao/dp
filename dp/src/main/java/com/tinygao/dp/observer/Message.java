package com.tinygao.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Message implements Subject {

    private List<Observer> obj = new ArrayList<Observer>();
    
    @Override
    public void addObserver(Observer ob) {
        this.obj.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
       this.obj.remove(ob);
    }

    @Override
    public void notifyAllObservers() {
       for(Observer ob:this.obj) {
           ob.update(this);
       }
        
    }

    @Override
    public void displaySubject() {
        System.out.println("message:" + System.currentTimeMillis());
    }

}

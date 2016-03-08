package com.tinygao.dp.observer;

public interface Subject {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyAllObservers();
    void displaySubject();
}

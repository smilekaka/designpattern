package com.kaka.designpattern.observe.subject;

import com.kaka.designpattern.observe.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

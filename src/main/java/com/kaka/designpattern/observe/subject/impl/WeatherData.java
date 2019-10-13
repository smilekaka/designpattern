package com.kaka.designpattern.observe.subject.impl;

import com.kaka.designpattern.observe.observer.Observer;
import com.kaka.designpattern.observe.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if(i>=0){
            observerList.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i=0;i<observerList.size();i++){
            Observer observer = observerList.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

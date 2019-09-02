package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void Add(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

}

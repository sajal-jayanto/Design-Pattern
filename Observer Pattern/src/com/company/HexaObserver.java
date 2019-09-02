package com.company;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.Add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex Value of " + subject.getState() + " is " + Integer.toHexString(subject.getState()));
    }
}

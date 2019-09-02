package com.company;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.Add(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Value of " + subject.getState() + " is " + Integer.toBinaryString(subject.getState()));
    }
}

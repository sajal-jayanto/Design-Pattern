package com.company;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.Add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal Value of " + subject.getState() + " is " + Integer.toOctalString(subject.getState()));
    }
}

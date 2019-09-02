package com.company;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);


        System.out.println("Update the state by 101");
        subject.setState(101);

        System.out.print("\n\n");

        System.out.println("Update the state by 79");
        subject.setState(79);
    }
}

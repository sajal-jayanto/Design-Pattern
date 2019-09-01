package com.company;

public class Main {

    public static void main(String[] args) {

        Client add = new Client(new Add());
        System.out.println("10 + 9 = " + add.executeStrategy(10 , 9));

        Client substract = new Client(new Substract());
        System.out.println("10 - 9 = " + substract.executeStrategy(10 , 9));

        Client multiply = new Client(new Multiply());
        System.out.println("10 * 9 = " + multiply.executeStrategy(10 , 9));



    }
}

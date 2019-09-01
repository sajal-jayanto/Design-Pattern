package com.company;

public class Add implements IStrategy {
    @Override
    public int Operation(int one, int two) {
        return one + two;
    }
}

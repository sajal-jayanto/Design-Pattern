package com.company;

public class Multiply implements IStrategy {
    @Override
    public int Operation(int one, int two) {
        return one * two;
    }
}

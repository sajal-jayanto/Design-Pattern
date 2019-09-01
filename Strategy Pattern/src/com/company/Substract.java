package com.company;

public class Substract implements IStrategy {
    @Override
    public int Operation(int one, int two) {
        return one - two;
    }
}

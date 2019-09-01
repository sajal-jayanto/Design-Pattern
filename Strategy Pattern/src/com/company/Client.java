package com.company;

public class Client {

    private IStrategy strategy;

    public Client(IStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int one , int two){
        return strategy.Operation(one , two);
    }

}

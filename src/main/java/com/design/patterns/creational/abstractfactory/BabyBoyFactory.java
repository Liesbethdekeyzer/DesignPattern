package com.design.patterns.creational.abstractfactory;

public class BabyBoyFactory extends BabyStuffFactory{

    @Override
    public Chair chair() {
        return new BabyBoyChair();
    }

    @Override
    public Crib crib() {
        return new BabyBoyCrib();
    }
}

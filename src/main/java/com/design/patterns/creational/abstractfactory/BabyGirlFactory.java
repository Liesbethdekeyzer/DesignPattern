package com.design.patterns.creational.abstractfactory;

public class BabyGirlFactory extends BabyStuffFactory{

    @Override
    public Chair chair() {
        return new BabyGirlChair();
    }

    @Override
    public Crib crib() {
        return new BabyGirlCrib();
    }
}

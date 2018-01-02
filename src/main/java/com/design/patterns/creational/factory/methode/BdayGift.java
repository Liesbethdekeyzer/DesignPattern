package com.design.patterns.creational.factory.methode;

public class BdayGift extends Gift {

    @Override
    public void unWrap() {
        System.out.println("I'm a birthday gift");
    }

    @Override
    public void price() {
        System.out.println("I'm a 25 euro");
    }

}

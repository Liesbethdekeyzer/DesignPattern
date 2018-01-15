package com.design.patterns.creational.methodefactory;

public class XmasGift extends Gift {

    @Override
    public void unWrap() {
        System.out.println("I'm a X-mas gift");
    }

    @Override
    public void price() {
        System.out.println("I'm a 25 euro");
    }
}

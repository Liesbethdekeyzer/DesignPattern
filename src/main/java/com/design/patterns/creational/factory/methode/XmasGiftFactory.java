package com.design.patterns.creational.factory.methode;

public class XmasGiftFactory extends GiftFactory{

    public static Gift createStatic() {
        return new XmasGift();
    }

    @Override
    public Gift create() {
        return new XmasGift();
    }
}

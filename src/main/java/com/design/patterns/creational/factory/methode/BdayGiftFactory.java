package com.design.patterns.creational.factory.methode;

public class BdayGiftFactory extends GiftFactory {

    public static Gift createStatic() {
        return new BdayGift();
    }

    @Override
    public Gift create() {
        return new BdayGift();
    }
}

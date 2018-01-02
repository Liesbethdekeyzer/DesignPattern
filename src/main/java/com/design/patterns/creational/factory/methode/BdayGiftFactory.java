package com.design.patterns.creational.factory.methode;

public class BdayGiftFactory extends GiftFactory {

    @Override
    public Gift createGift() {
        return new BdayGift();
    }
}

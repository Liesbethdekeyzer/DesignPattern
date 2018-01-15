package com.design.patterns.creational.factory.methode;

public class BdayGiftStore extends GiftStore {

    @Override
    public Gift createGift() {
        return new BdayGift();
    }
}

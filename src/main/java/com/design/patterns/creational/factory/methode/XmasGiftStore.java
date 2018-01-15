package com.design.patterns.creational.factory.methode;

public class XmasGiftStore extends GiftStore {

    @Override
    public Gift createGift() {
        return new XmasGift();
    }
}

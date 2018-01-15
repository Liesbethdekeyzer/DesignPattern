package com.design.patterns.creational.methodefactory;

public class XmasGiftStore extends GiftStore {

    @Override
    public Gift createGift() {
        return new XmasGift();
    }
}

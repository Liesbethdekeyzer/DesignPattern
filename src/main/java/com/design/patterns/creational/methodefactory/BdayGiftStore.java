package com.design.patterns.creational.methodefactory;

public class BdayGiftStore extends GiftStore {

    @Override
    public Gift createGift() {
        return new BdayGift();
    }
}

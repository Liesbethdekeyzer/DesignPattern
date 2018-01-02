package com.design.patterns.creational.factory.methode;

public class XmasGiftFactory extends GiftFactory{

    @Override
    public Gift createGift() {
        return new XmasGift();
    }
}

package com.design.patterns.creational.factory.methode;

public abstract class GiftFactory {

    public Gift buy(){
        Gift gift = createGift();
        gift.price();
        return gift;
    }

    public abstract Gift createGift();

}

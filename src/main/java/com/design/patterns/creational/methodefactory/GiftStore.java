package com.design.patterns.creational.methodefactory;

public abstract class GiftStore {

    public Gift buy(){
        Gift gift = createGift();
        return gift;
    }

    public abstract Gift createGift();

}

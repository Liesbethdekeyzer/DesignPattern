package com.design.patterns.creational.singelton;

import com.design.patterns.creational.methodefactory.BdayGift;
import com.design.patterns.creational.methodefactory.Gift;
import com.design.patterns.creational.methodefactory.XmasGift;

public enum GiftType {
    Xmas(new XmasGift()), Bday(new BdayGift()), normal(new Gift());

    private Gift gift;

    GiftType(Gift gift){
        this.gift = gift;
    }

    public Gift getGift() {
        return gift;
    }
}

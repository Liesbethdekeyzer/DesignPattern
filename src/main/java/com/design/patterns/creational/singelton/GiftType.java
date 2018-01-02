package com.design.patterns.creational.singelton;

import com.design.patterns.creational.factory.methode.BdayGift;
import com.design.patterns.creational.factory.methode.Gift;
import com.design.patterns.creational.factory.methode.XmasGift;

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

package com.design.patterns.creational.factory.methode;

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

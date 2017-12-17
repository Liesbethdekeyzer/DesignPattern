package com.design.patterns.creational.factory.methode;

public abstract class GiftFactory {

    public static Gift create(GiftType type) {
        switch (type) {
            case Xmas:
                return XmasGiftFactory.createStatic();
            case Bday:
                return BdayGiftFactory.createStatic();
            case normal:
                return new Gift();
            default:
                return new Gift();
        }
    }

    public abstract Gift create();

}

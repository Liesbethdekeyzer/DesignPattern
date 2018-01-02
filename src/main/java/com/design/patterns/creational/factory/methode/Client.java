package com.design.patterns.creational.factory.methode;

public class Client {

    public static void main(String[] args) {
     GiftFactory giftFactory = initialize(GiftType.Xmas);
     Gift gift = giftFactory.buy();
     gift.unWrap();
    }

    public static GiftFactory initialize(GiftType type) {
        switch (type) {
            case Xmas:
                return new XmasGiftFactory();
            case Bday:
                return new BdayGiftFactory();
            default:
                return new BdayGiftFactory();
        }
    }

}

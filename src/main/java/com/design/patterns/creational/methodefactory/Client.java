package com.design.patterns.creational.methodefactory;

public class Client {

    public static void main(String[] args) {
     GiftStore giftFactory = initialize(GiftType.Xmas);
     Gift gift = giftFactory.buy();
     gift.unWrap();
    }

    public static GiftStore initialize(GiftType type) {
        switch (type) {
            case Xmas:
                return new XmasGiftStore();
            case Bday:
                return new BdayGiftStore();
            default:
                return new BdayGiftStore();
        }
    }

}

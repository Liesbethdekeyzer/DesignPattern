package com.design.patterns.creational.factory.methode;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        //non static factory new gift type ==> new subclass
        // use of override
        for (int i = 0; i <= 10; i++) {
            GiftFactory factory = createRandomFactory();
            factory.create().unWrap();
        }

        /*factory = new BdayGiftFactory();
        factory.create().unWrap();

        //static method factory in case of a new gift type ==> new subclass
        // can't override static fields inheritance?
        Gift gift = XmasGiftFactory.createStatic();
        gift.unWrap();
        gift = BdayGiftFactory.createStatic();
        gift.unWrap();

        //static factory method with swith and GiftType
        //neg: So whenever we want a new type of gift,we'll have to adapt the enum.
        // The goal of the factory method pattern is that you don't know all the possibilities,
        // but still have to create a gift object.
        gift = GiftFactory.create(GiftType.normal);
        gift.unWrap();

        // enum (singleton)
        GiftType.normal.getGift().unWrap();*/
    }

    public static GiftFactory createRandomFactory() {
        Random random = new Random();
        boolean nextBoolean = random.nextBoolean();
        return nextBoolean ? new XmasGiftFactory() : new BdayGiftFactory();
    }

}

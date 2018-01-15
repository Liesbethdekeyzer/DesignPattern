package com.design.patterns.creational.abstractfactory;

import java.util.Random;

public class Client {

    private BabyStuffFactory babyStuffFactory;

    public static void main(String[] args) {
        BabyStuffFactory babyStuff = initialize();
        Chair chair = babyStuff.chair();
        chair.color();
        Crib crib = babyStuff.crib();
        crib.color();
    }

    public static BabyStuffFactory initialize() {
        Random random = new Random();
        boolean boy = random.nextBoolean();

        if (boy) {
            return new BabyBoyFactory();
        } else {
            return new BabyGirlFactory();
        }
    }

}

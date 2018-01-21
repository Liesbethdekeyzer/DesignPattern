package com.design.patterns.structural.adaptor;

public class Client {

    public static void main(String[] args) {
        Fighter fighter = new WizardAdapter();
        fighter.defend();
        fighter.attack();
        fighter.escape();
    }
}

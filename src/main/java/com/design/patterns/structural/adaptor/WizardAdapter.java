package com.design.patterns.structural.adaptor;

public class WizardAdapter implements Fighter {

    private Wizard wizard = new Wizard();

    @Override
    public void attack() {
        wizard.castDestructionSpell();

    }

    @Override
    public void defend() {
        wizard.shield();

    }

    @Override
    public void escape() {
        wizard.portal();
    }
}

package com.mycompany.WarGameApp.model;

public abstract class AbstractCard {
    protected int value;
    
    public AbstractCard(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public abstract String describe();
}
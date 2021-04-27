package com.berksefkatli.carfactory.model;

public class Sedan implements Car {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

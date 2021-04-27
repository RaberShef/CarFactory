package com.berksefkatli.carfactory.model;

public class Hatchback implements Car {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

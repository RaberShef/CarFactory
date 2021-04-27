package com.berksefkatli.carfactory.model;

public class Cabrio implements Car {

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

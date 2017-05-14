package com.accoffin.yurse.application;

/**
 * Created by Yurtov on 02.05.2017.
 */

public class Subject {
    private final String name;
    private final double price;

    public Subject(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

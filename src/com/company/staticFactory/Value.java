package com.company.staticFactory;

public class Value {

    private String name;
    private double value;
    private double suff;

    private Value(String name, double value, double suff) {
        this.name = name;
        this.value = value;
        this.suff = suff;
    }

    // Static factory
    public static Value getInstance(String name, double value) {
        return new Value(name, value, Math.random());
    }
}

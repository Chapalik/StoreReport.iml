package com.company.dto;

public class BuyingDto {

    private String name;
    private int count;
    private double sum;

    public BuyingDto(String name, int count, double sum) {
        this.name = name;
        this.count = count;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }
}

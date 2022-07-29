package com.company.dto;

public class ReportDto {

    private String name;
    private BuyingDto[] data;
    private double totalSum;

    public ReportDto(String name, BuyingDto[] data, double totalSum) {
        this.name = name;
        this.data = data;
        this.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public BuyingDto[] getData() {
        return data;
    }

    public double getTotalSum() {
        return totalSum;
    }
}

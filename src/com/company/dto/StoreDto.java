package com.company.dto;

public class StoreDto {

    private String name;
    private BuyingDto[] sells;

    public StoreDto(String name, BuyingDto[] sells) {
        this.name = name;
        this.sells = sells;
    }

    public String getName() {
        return name;
    }

    public BuyingDto[] getSells() {
        return sells;
    }
}

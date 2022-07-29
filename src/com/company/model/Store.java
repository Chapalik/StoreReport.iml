package com.company.model;

import com.company.model.product.Buying;

public class Store {

    private String name;
    private Buying[] sales;

    public Store(String name, Buying[] sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public Buying[] getSales() {
        return sales;
    }
}

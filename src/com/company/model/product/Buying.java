package com.company.model.product;

public class Buying {

    private Product product;
    private int count;

    public Buying(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}

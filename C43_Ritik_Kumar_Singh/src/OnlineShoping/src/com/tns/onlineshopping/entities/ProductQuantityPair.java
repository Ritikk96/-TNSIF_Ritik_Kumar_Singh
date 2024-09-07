package com.tns.onlineshopping.entities;

public class ProductQuantityPair {
    private Product product;
    private int quantity;

    // Constructor, getters, setters
    public ProductQuantityPair(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductQuantityPair [product=" + product.getName() + ", quantity=" + quantity + "]";
    }
}

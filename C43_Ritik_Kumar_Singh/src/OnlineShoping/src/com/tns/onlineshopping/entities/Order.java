package com.tns.onlineshopping.entities;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private Customer customer;
    private List<ProductQuantityPair> products;
    private String status;

    // Constructor, getters, setters, methods to add products, update order status
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.status = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<ProductQuantityPair> getProducts() {
        return products;
    }

    public void addProduct(Product product, int quantity) {
        products.add(new ProductQuantityPair(product, quantity));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customer=" + customer.getUsername() + ", status=" + status + "]";
    }
}

package com.tns.onlineshopping.entities;

import java.util.List;

import onlineshopping.entities.User;

import java.util.ArrayList;

public class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    // Constructor, getters, setters, and methods for placing orders, viewing orders
    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
        this.shoppingCart = new ShoppingCart();
        this.orders = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer [userId=" + userId + ", username=" + username + ", email=" + email + ", address=" + address
                + "]";
    }
}

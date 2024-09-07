package com.tns.onlineshopping.entities;

import onlineshopping.entities.User;

public class Admin extends User {
    // Methods for adding/removing products, updating order status, viewing
    // products/orders
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public String toString() {
        return "Admin [userId=" + userId + ", username=" + username + ", email=" + email + "]";
    }
}

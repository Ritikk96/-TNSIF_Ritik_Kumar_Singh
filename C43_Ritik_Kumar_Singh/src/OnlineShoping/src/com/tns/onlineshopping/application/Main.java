package com.tns.onlineshopping.application;

import com.tns.onlineshopping.services.*;
import com.tns.onlineshopping.entities.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.tns.onlineshopping.entities.Admin;
import com.tns.onlineshopping.entities.Customer;
import com.tns.onlineshopping.entities.Order;
import com.tns.onlineshopping.entities.Product;
import com.tns.onlineshopping.entities.ProductQuantityPair;
import com.tns.onlineshopping.services.CustomerService;
import com.tns.onlineshopping.services.OrderService;
import com.tns.onlineshopping.services.ProductService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        CustomerService customerService = new CustomerService();
        AdminService adminService = new AdminService();
        OrderService orderService = new OrderService();

        // Display menu and handle user input for Admin and Customer operations
        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1:
                    adminMenu(scanner, productService, adminService, orderService);
                    break;
                case 2:
                    customerMenu(scanner, productService, customerService, orderService);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    public static void adminMenu(Scanner scanner, ProductService productService, AdminService adminService,
            OrderService orderService) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    productService.addProduct(new Product(productId, name, price, stock));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    productId = scanner.nextInt();
                    scanner.nextLine();
                    productService.removeProduct(productId);
                    System.out.println("Product removed successfully!");
                    break;
                case 3:
                    List<Product> products = productService.viewProducts();
                    System.out.println("Products:");
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 4:
                    System.out.print("Enter Admin ID: ");
                    int adminId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Admin Username: ");
                    String adminName = scanner.nextLine();
                    System.out.print("Enter Admin Email: ");
                    String adminEmail = scanner.nextLine();
                    adminService.addAdmin(new Admin(adminId, adminName, adminEmail));
                    System.out.println("Admin created successfully!");
                    break;
                case 5:
                    List<Admin> admins = adminService.viewAdmins();
                    System.out.println("Admins:");
                    for (Admin admin : admins) {
                        System.out.println(admin);
                    }
                    break;
                case 6:
                    System.out.print("Enter Order ID: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
                    String status = scanner.nextLine();
                    orderService.updateOrderStatus(orderId, status);
                    System.out.println("Order status updated successfully!");
                    break;
                case 7:
                    List<Order> orders = orderService.viewOrders();
                    System.out.println("Orders:");
                    for (Order order : orders) {
                        System.out.println(order);
                        for (ProductQuantityPair pq : order.getProducts()) {
                            System.out.println(
                                    "  Product: " + pq.getProduct().getName() + ", Quantity: " + pq.getQuantity());
                        }
                    }
                    break;
                case 8:
                    return; // Exit Admin Menu
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    public static void customerMenu(Scanner scanner, ProductService productService, CustomerService customerService,
            OrderService orderService) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. View Products");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Username: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Customer Email: ");
                    String customerEmail = scanner.nextLine();
                    System.out.print("Enter Customer Address: ");
                    String address = scanner.nextLine();
                    customerService.addCustomer(new Customer(customerId, customerName, customerEmail, address));
                    System.out.println("Customer created successfully!");
                    break;
                case 2:
                    List<Customer> customers = customerService.viewCustomers();
                    System.out.println("Customers:");
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    customerId = scanner.nextInt();
                    Customer customer = null;
                    for (Customer c : customerService.viewCustomers()) {
                        if (c.getUserId() == customerId) {
                            customer = c;
                            break;
                        }
                    }
                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }
                    Order order = new Order(orderService.viewOrders().size() + 1, customer);
                    while (true) {
                        System.out.print("Enter Product ID to add to order (or -1 to complete): ");
                        int productId = scanner.nextInt();
                        if (productId == -1)
                            break;
                        Product product = null;
                        for (Product p : productService.viewProducts()) {
                            if (p.getProductId() == productId) {
                                product = p;
                                break;
                            }
                        }
                        if (product == null) {
                            System.out.println("Product not found!");
                            continue;
                        }
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        order.addProduct(product, quantity);
                    }
                    orderService.addOrder(order);
                    System.out.println("Order placed successfully!");
                    break;
                case 4:
                    System.out.print("Enter Customer ID: ");
                    customerId = scanner.nextInt();
                    System.out.println("Orders for Customer ID " + customerId + ":");
                    for (Order o : orderService.viewOrders()) {
                        if (o.getCustomer().getUserId() == customerId) {
                            System.out.println(o);
                        }
                    }
                    break;
                case 5:
                    List<Product> products = productService.viewProducts();
                    System.out.println("Products:");
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 6:
                    return; // Exit Customer Menu
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

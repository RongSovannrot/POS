package com.pos.model;
import java.util.Date;

import Product;

public class Order {
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private String status; // Pending, Completed
    private Date orderTime;
    private int productReview; //rate from 1 to 5
    private int employeeId;

    //cons for ordering
    public Order(int orderId, Customer customer, Product product, int quantity, String status, int employeeId) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.orderTime = new Date();
        this.employeeId = employeeId;
    }

    public int getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getStatus() {
        return status;
    }

    public String getProductReview() {
        return productReview;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProductReview(String review) {
        this.productReview = review;
    }
}

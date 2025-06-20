package com.pos.model.collections;

import com.pos.model.Customer;
import java.util.*;

public class CustomerCollection {
    private List<Customer> customers;
    
    public CustomerCollection() {
        this.customers = new ArrayList<>();
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public Customer findCustomerByPhone(String phoneNumber) {
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        }
        return null;
    }
    
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }
    
    public boolean removeCustomer(String phoneNumber) {
        return customers.removeIf(customer -> customer.getPhoneNumber().equals(phoneNumber));
    }
    
    public List<Customer> getCustomersByLoyaltyPoints(int minPoints) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getLoyaltyPoints() >= minPoints) {
                result.add(customer);
            }
        }
        return result;
    }
}

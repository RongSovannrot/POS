# POS System - Java OOP Project

This project is a simple **Point of Sale (POS)** system built using Java Object-Oriented Programming (OOP).  
It includes basic classes to represent real-world components in a shop: **Customer**, **Product**, **Order**, and **Staff**.

---

### Entities & Attribute

#### 1. Customer

Represents who buys products.

**Attributes:**
- `name`: customer's full name.
- `phoneNumber`: used to contact or identify the customer.
- `address`: for deliveries or customer records.
- `dob`: date of birth (used for promotions).
- `registerDate`: make sure they are our membership.
- `totalBuy`: how many times they bought from the shop (used for promotion).
- `loyaltyPoints`: points earned from purchases.
- `password`: used for login (should be hashed in real apps).

**Constructor:**
```java
public Customer(String name, String phoneNumber, String address, String password, Date dob)
```

#### 2. Order

Represents a purchase made by a customer.

**Attributes:**
- `orderId`: to identify the order uniquely, like a receipt number.
- `customer`: who order
- `product`: what product they ordered.
- `quantity`: how many product.
- `status`: to know if it's "Pending" or "Completed".
- `orderTime`: when the order was placed.
- `productReview`: how customer rated the product (1–5).
- `employeeID`: which staff helped them (useful in reports).

**Constructor:**
```java
public Order(int orderId, Customer customer, Product product, int quantity, String status, int employeeId)
```

#### 3. Product

Represents a product selling in the shop.

**Attributes:**
- `productId`: unique code to identify the product.
- `p_name`: the name of the product.
- `category`: to group similar items.
- `price`: cost of the product.
- `quantity`: the amount of product leave in stock.
- `size`: S, M, L, XL.
- `stock`: available or unavailable.
- `importDate`: when the product arrived in store.
- `outStockDate`: when it sold out (used to track fast-selling products).
- `sellOutDuration`: days it took to sell it out.
- `loyaltyPointReward`: point for customer to get promotion.

**Constructor:**
```java
Product(int productId, String p_name, String category, double price, char size, int stock, int quantity)
```
```java
Product(String p_name, String category, char size, double price, int sellOutDuration)
```
#### 4. Staff

Represents a staff member working at the shop.

**Attributes:**
- `staffName`: Name of the staff.
- `staffId`: Unique ID for the staff.
- `role`: Their job role (cashier, manager).
- `shift`: Working shift (morning, evening).
- `phoneNumber`: For contact or login.
- `salary`: Monthly salary.
- `address`: Home address.
- `password`: Login password (should be hashed).
- `idNumber`: Government or system ID.

**Constructors:**
```java
Staff(String staffName, String staffId, String role, String shift, String phoneNumber, double salary, String address, String idNumber)
```


### Public & Private
In our system, we set all attributes in each class to `private`.  
The purpose is to protect the data, so that other classes cannot access or change the values directly.

For example, if `productId` in the `Product` class was `public`, then the `Order` class (or any other class) could directly change it like this:

    product.productId = 999; 

This can cause serious problems, like giving the wrong ID to a product.

Instead, we use `getter` and `setter` methods (like `getProductId()` or `setProductId(int id)`), which are `public`.  
Other classes can use these methods to safely access or update values with control.

For example:
- To get a product's ID: `product.getProductId();`
- To set a product's ID: `product.setProductId(101);`

### Collection
#### Why Use `ArrayList`?

- Customers: small dataset, linear search by phone is sufficient, preserves, registration, order.
- Products: limited catalog, frequent updates, easy display order maintenance.
- Orders: chronological tracking, small daily volume, recent-order focus.
- Staff: Very small size (5–20 people), simple search, rare updates.

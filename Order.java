import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
    private double quantity;
    private String status; // e.g., "Pending", "Shipped"
    private Date orderTime;
    private int totalPrice;
    private int employeeId;
    private String productReview;
    private int productId;

    // Constructor
    public Order(int orderId, Customer customer, double quantity, String status, Date orderTime, int employeeId, int totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.quantity = quantity;
        this.status = status;
        this.orderTime = orderTime;
        this.employeeId = employeeId;
        this.totalPrice = totalPrice;
    }

    // Getters and setters for access control
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getProductReview() {
        return productReview;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Other setters can be added as needed, depending on business logic
}

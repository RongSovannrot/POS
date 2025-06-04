import java.util.Date;

public class Order {
    int orderId;
    Customer customer;
    double amount;
    String status; // e.g., "Pending", "Shipped"
    Date orderTime;

    public Order(int orderId, Customer customer, double amount, String status, Date orderTime) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.status = status;
        this.orderTime = orderTime;
    }
}
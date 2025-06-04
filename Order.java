public import java.util.Date;
public class Order {
    int orderId;
    Customer customer;
    double quantity;
    String status; // e.g., "Pending", "Shipped"
    Date orderTime;
    int total_price;
    int employee_id;
    String product_review;
    int product_id;


    public Order(int orderId, Customer customer, double quantity, String status, Date orderTime,int employee_id,int total_price) {
        this.orderId = orderId;
        this.customer = customer;
        this.quantity = quantity;
        this.status = status;
        this.orderTime = orderTime;
        this.employee_id = employee_id;
        this.total_price = total_price
    }
}
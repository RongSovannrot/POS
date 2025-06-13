import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
<<<<<<< HEAD
    private Product product;
    private int quantity;
    private String status; // Pending, Completed
    private Date orderTime;
    private int employeeId;
    private String productReview;

    //cons
    public Order(int orderId, Customer customer, Product product, int quantity, String status, int employeeId) {
=======
    private double quantity;
    private String status; // e.g., "Pending", "Shipped"
    private Date orderTime;
    private int totalPrice;
    private int employeeId;
    private String productReview;
    private int productId;

    // Constructor
    public Order(int orderId, Customer customer, double quantity, String status, Date orderTime, int employeeId, int totalPrice) {
>>>>>>> 75bf279625213463b28136f945920f146e23d249
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
<<<<<<< HEAD
        this.orderTime = new Date();
        this.employeeId = employeeId;
    }

=======
        this.orderTime = orderTime;
        this.employeeId = employeeId;
        this.totalPrice = totalPrice;
    }

    // Getters and setters for access control
>>>>>>> 75bf279625213463b28136f945920f146e23d249
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

<<<<<<< HEAD
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
=======
    public double getQuantity() {
>>>>>>> 75bf279625213463b28136f945920f146e23d249
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderTime() {
        return orderTime;
    }

<<<<<<< HEAD
=======
    public int getTotalPrice() {
        return totalPrice;
    }

>>>>>>> 75bf279625213463b28136f945920f146e23d249
    public int getEmployeeId() {
        return employeeId;
    }

    public String getProductReview() {
        return productReview;
    }

<<<<<<< HEAD
=======
    public int getProductId() {
        return productId;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

>>>>>>> 75bf279625213463b28136f945920f146e23d249
    public void setStatus(String status) {
        this.status = status;
    }

<<<<<<< HEAD
    public void setProductReview(String review) {
        this.productReview = review;
    }
=======
    // Other setters can be added as needed, depending on business logic
>>>>>>> 75bf279625213463b28136f945920f146e23d249
}

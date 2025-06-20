import com.pos.model.Order;
import com.pos.model.Customer;
import com.pos.model.Product;
import java.util.*;

public class OrderCollection {
    private List<Order> orders;
    
    public OrderCollection() {
        this.orders = new ArrayList<>();
    }
    
    public void addOrder(Order order) {
        orders.add(order);
    }
    
    public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
    
    public List<Order> getOrdersByCustomer(Customer customer) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                result.add(order);
            }
        }
        return result;
    }
    
    public List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus().equalsIgnoreCase(status)) {
                result.add(order);
            }
        }
        return result;
    }
    
    public List<Order> getOrdersByEmployee(int employeeId) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getEmployeeId() == employeeId) {
                result.add(order);
            }
        }
        return result;
    }
    
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }
    
    public boolean removeOrder(int orderId) {
        return orders.removeIf(order -> order.getOrderId() == orderId);
    }
    
    public double getTotalSalesByProduct(Product product) {
        double total = 0;
        for (Order order : orders) {
            if (order.getProduct().equals(product) && order.getStatus().equalsIgnoreCase("Completed")) {
                total += order.getProduct().getPrice() * order.getQuantity();
            }
        }
        return total;
    }
}
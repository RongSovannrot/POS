public class Product {
    String name;
    String category;
    double price;
    int stock;
    int product_id;
    int promotion;
    int employee_id;
    char size; 
    String description;
// Constructor TO ADD product to order
    public Product(String name, String category, double price, char size) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.size = size;
    }
}
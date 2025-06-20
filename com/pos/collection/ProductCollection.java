
import com.pos.model.Product;
import java.util.*;

public class ProductCollection {
    private List<Product> products;
    
    public ProductCollection() {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
    
    public List<Product> findProductsByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }
    
    public List<Product> getAvailableProducts() {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.isStock() && product.getQuantity() > 0) {
                result.add(product);
            }
        }
        return result;
    }
    
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    
    public boolean removeProduct(int productId) {
        return products.removeIf(product -> product.getProductId() == productId);
    }
    
    public List<Product> findProductsByPriceRange(double minPrice, double maxPrice) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                result.add(product);
            }
        }
        return result;
    }
}
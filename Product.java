import java.util.Date;

public class Product {
    private String p_name; //crop t-shirt, black trouser, floral dress
    private String category; //shirt, Pants, Dress
    private double price;
    private int quantity; 
    private double promotionDiscount; //percentage (0-100)
    private int productId;
    private char size; //L, M, S
    private boolean stock; //available, unavailable
    private Date importDate;
    private Date outStockDate;
    private int sellOutDuration; //sell out in x days

    //cons for new product
    public Product(int productId, String p_name, String category, double price, char size, int stock, int quantity, double promotionDiscount) {
        this.productId = productId;
        this.p_name = p_name;
        this.category = category;
        this.price = price;
        this.size = size;
        this.promotionDiscount = promotionDiscount; 
        this.quantity = quantity; 
        this.stock = stock;
        this.importDate = new Date(); 
    }

    //cons for orders
    public Product(String p_name, String category, double price, double promotionDiscount, char size, boolean stock) { 
        this.p_name = p_name;
        this.category = category;
        this.price = price;
        this.promotionDiscount = promotionDiscount;
        this.size = size;
        this.stock = stock;
        this.importDate = new Date();
    }

    //cons for reporting product
    public Product(String p_name, String category, char size, double price, int sellOutDuration) { 
        this.p_name = p_name;
        this.category = category;
        this.price = price;
        this.size = size;
        this.sellOutDuration = sellOutDuration;
        this.importDate = new Date();
    }

    public int getProductId() {
        return productId;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public double getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(double promotionDiscount) {
        if (promotionDiscount >= 0 && promotionDiscount <= 100) {
            this.promotionDiscount = promotionDiscount;
        }
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public Date getOutStockDate() {
        return outStockDate;
    }

    public void setOutStockDate(Date outStockDate) {
        this.outStockDate = outStockDate;
    }

    public int getSellOutDuration() {
        return sellOutDuration;
    }

    public void setSellOutDuration(int sellOutDuration) {
        this.sellOutDuration = sellOutDuration;
    }

    public void reduceQuantity(int soldQuantity) {
        if (quantity >= soldQuantity) {
            quantity -= soldQuantity;
            if (quantity == 0) {
                stock = false;
                outStockDate = new Date();
            }
        }
    }
}
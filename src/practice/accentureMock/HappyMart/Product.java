package practice.accentureMock.HappyMart;

public class Product {
    public int productId;
    public String productName;
    public double price;
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    @Override
    public String toString() {
        return productId + " " + productName + " " + price;
    }
}

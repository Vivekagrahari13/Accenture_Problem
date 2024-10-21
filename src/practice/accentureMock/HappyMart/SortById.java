package practice.accentureMock.HappyMart;

import java.util.Comparator;
public class SortById implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.productId - b.productId;
    }
}

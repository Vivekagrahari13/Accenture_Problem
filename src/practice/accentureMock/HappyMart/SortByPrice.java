package practice.accentureMock.HappyMart;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return Double.compare(a.price, b.price);
    }
}

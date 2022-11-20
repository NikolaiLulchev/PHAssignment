import java.util.ArrayList;
import java.util.List;

public final class Cart {

    private static final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        if (products.size() > 0) {
            return products;
        } else throw new IllegalArgumentException("Cart is empty!");
    }

}

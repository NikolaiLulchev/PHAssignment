import java.util.Arrays;

public class Shirt extends Product {
    private static final String[] ALLOWED_SHIRT_SIZE = {"XS", "S", "M", "L", "XL", "2XL"};
    private String size;

    protected Shirt(String name, String brand, double price, String color, String size) {
        super(name, brand, price, color);
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (Arrays.asList(ALLOWED_SHIRT_SIZE).contains(size.toUpperCase())) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size format or value not allowed!");
        }
    }
}

public class Shoes extends Product {

    private int size;

    protected Shoes(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >= 39 && size <= 46) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size format or value not allowed!");
        }
    }
}

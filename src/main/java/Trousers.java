
public class Trousers extends Product {
    private int size;


    protected Trousers(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >= 42 && size <= 66 && size % 2 == 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size format or value not allowed!");
        }
    }
}

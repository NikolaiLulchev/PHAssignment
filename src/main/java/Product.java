public abstract class Product {
    private String name;
    private String brand;
    private double price;
    private String color;

    private int discount;

    protected Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Product setColor(String color) {
        this.color = color;
        return this;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return String.format("%s - %s%n$%.2f%n",this.name,this.brand,this.price);
    }
}

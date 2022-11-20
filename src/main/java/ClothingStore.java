import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class ClothingStore {


    public static void main(String[] args) {

        Cart cart = new Cart();

//        cart.addProduct(new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", "M"));
//        cart.addProduct(new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", "M"));
//        cart.addProduct(new Trousers("Black Cotton Trousers", "BrandT", 29.99, "black", 50));
//        cart.addProduct(new Shoes("Black Leather Shoes", "BrandS", 59.99, "black", 43));
//        cart.addProduct(new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", 50));

//        cart.addProduct(new Shirt("Black Silk Shirt", "BrandS", 29.99, "black", "L"));
//        cart.addProduct(new Shirt("White Silk Shirt", "BrandS", 29.99, "white", "L"));


        cart.addProduct(new Trousers("Red Linen Trousers", "BrandT", 49.99, "red", 56));
        cart.addProduct(new Shoes("Red Suede Shoes", "BrandS", 59.99, "red", 44));
        cart.addProduct(new Shoes("Black Suede Shoes", "BrandS", 59.99, "black", 44));
        cart.addProduct(new Jacket("Red Linen Suit Jacket", "BrandJ", 99.99, "red", 56));
        cart.addProduct(new Shirt("White Linen Shirt", "BrandS", 29.99, "white", "L"));


        Cashier.printReceipt(cart, LocalDateTime.parse("2022-02-01T12:34:56"));
    }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier {

    public static void printReceipt(Cart cart,LocalDateTime dateTime) {

        double subtotal = 0;
        double discount = 0;

        StringBuilder sb = new StringBuilder();

        sb
                .append("Date: ").append(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                .append(System.lineSeparator())
                .append("---Products---")
                .append(System.lineSeparator());

        for (Product product : cart.getProducts()) {
            sb
                    .append(System.lineSeparator())
                    .append(product);

            if (cart.getProducts().size() >= 3) {
                product.setDiscount(20);
            }

            if (product instanceof Shirt
                && dateTime.getDayOfWeek().toString().equals("TUESDAY")
                && product.getDiscount() == 0) {

                product.setDiscount(10);
            }

            if (product instanceof Shoes && dateTime.getDayOfWeek().toString().equals("TUESDAY")) {
                product.setDiscount(25);
            }

            if (product.getDiscount() > 0) {
                sb.append(String.format("#discount %d%% -$%.2f", product.getDiscount(), product.getPrice() * product.getDiscount() / 100))
                        .append(System.lineSeparator());
            }
            subtotal += product.getPrice();
            discount += Math.round(product.getPrice()*product.getDiscount())/100.0;
        }
        sb.append("-----------------------------------------------------------------------------------").append(System.lineSeparator())
                .append(String.format("SUBTOTAL: $%.2f", subtotal)).append(System.lineSeparator())
                .append(String.format("DISCOUNT: -$%.2f", discount)).append(System.lineSeparator())
                .append(String.format("TOTAL: $%.2f", subtotal - discount));

        System.out.println(sb);
    }
}

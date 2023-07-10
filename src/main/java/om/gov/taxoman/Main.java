package om.gov.taxoman;

import om.gov.taxoman.entity.Order;
import om.gov.taxoman.entity.OrderStatus;
import om.gov.taxoman.entity.Product;
import om.gov.taxoman.entity.User;

import java.time.LocalDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product product = new Product(12, "Phone", "HUAWEI", new String[]{"P30 PRO"}, 550.0);
        User user = new User(1, "Hamed", "1234", new String[]{"ADMIN"});
        Product[] products= new Product[1];
        products[0] = product;
        Order order = new Order(456, products, LocalDateTime.now(), user, OrderStatus.DELIVERED );
        System.out.println(order);
    }
}
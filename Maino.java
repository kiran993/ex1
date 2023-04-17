import java.util.ArrayList;
import java.util.List;

public class Maino{

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", "johndoe@example.com",
                "123 Main St, Anytown, USA", "555-1234"));
        customers.add(new Customer("Jane Smith", "janesmith@example.com",
                "456 High St, Anytown, USA", "555-5678"));

                System.out.println(customers);

        // Create a list of orders
        List<Order> orders = new ArrayList<>();

        // Add some orders
        List<String> products1 = new ArrayList<>();
        products1.add("Product 1");
        products1.add("Product 2");
        orders.add(new Order("001", products1, 50.0, "Pending", "Not Delivered"));

        List<String> products2 = new ArrayList<>();
        products2.add("Product 3");
        products2.add("Product 4");
        orders.add(new Order("002", products2, 75.0, "Delivered", "Delivered"));
        System.out.println(orders);
       // System.out.println(products2);
    }
    
}

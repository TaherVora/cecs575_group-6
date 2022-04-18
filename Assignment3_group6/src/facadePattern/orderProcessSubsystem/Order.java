package orderProcessSubsystem;

public class Order {
    public void createOrder(int productId, int amount) {
        System.out.println("Order is created. Processing payment of $"+amount+".");
    }
}

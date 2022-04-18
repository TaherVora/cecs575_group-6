package orderProcessSubsystem;

public class ShoppingCart {
    public void addItem(int productId, int amount) {
        System.out.println("Item is added to the cart.");
        checkout(productId, amount);
    }
    private void checkout(int productId, int amount) {
        System.out.println("Checkout initiated.");
        Order obj = new Order();
        obj.createOrder(productId, amount);
    }
}

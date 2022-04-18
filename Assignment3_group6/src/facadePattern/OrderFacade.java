// Facade 

import orderProcessSubsystem.*;
import paymentSubsystem.*;
import inventorySubsystem.*;
import shipmentSubsystem.*;
  
public class OrderFacade{

    private ShoppingCart shoppingCart = new ShoppingCart();
    private Payment payment = new Payment();
    private Stock stock = new Stock();
    private Shipment shipment = new Shipment ();
     
    public void placeOrder(int productId) {
        int status = stock.checkItemAvailability(productId); // calling and returning from inventorySubsystem
        if(status > 0) {
            System.out.println("Item is available.");
            shoppingCart.addItem(productId, status); // calling and returning from orderProcessSubsystem
            String pay = payment.verifyPaymentDetails(); // calling and returning from paymentSubsystem
            System.out.println(pay);
            String ship = shipment.createShipment(); // calling and returning from shipmentSubsystem
            System.out.println(ship); 
            System.out.println("===== ORDER SUCCESSFULL =====");
        }
        else 
            System.out.println("Item is out of stock. Order cannot be completed.");
    }
}
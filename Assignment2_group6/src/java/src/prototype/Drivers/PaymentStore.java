package prototype.Drivers;

import java.util.*;

import prototype.Prototype.PaymentCloneable;
import prototype.PaymentMethods.*;

public class PaymentStore {
	  
    private static Map<String, PaymentCloneable> colorMap = new HashMap<String, PaymentCloneable>();
      
    static
    {
        colorMap.put("Credit/Debit Card", new creditDebitCard());
        colorMap.put("Netbanking Payment", new onlineNetbanking());
        colorMap.put("Paypal Payment", new paypalPayment());
    }
      
    public static PaymentCloneable getPaymentType(String paymentType)
    {
        return (PaymentCloneable) colorMap.get(paymentType).clone();
    }
}

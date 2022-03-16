package prototype.PaymentMethods;

import prototype.Prototype.PaymentCloneable;

public class paypalPayment extends PaymentCloneable {
	
	public paypalPayment() {
		this.paymentType = "Paypal Payment";
	}
	
	@Override
	public void selectPaymentMethod() {
		System.out.println("Method to carry out transactions using using 3rd party paypal.");
	}

}

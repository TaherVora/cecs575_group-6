package prototype.PaymentMethods;

import prototype.Prototype.PaymentCloneable;

public class onlineNetbanking extends PaymentCloneable {
	
	public onlineNetbanking() {
		this.paymentType = "Netbanking Payment";
	}
	
	@Override
	public void selectPaymentMethod() {
		System.out.println("Method to carry out transactions using Account Number & Routing Code");
	}

}

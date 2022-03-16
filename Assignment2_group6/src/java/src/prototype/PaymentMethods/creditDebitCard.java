package prototype.PaymentMethods;

import prototype.Prototype.PaymentCloneable;

public class creditDebitCard extends PaymentCloneable {
	
	public creditDebitCard() {
		this.paymentType = "Credit/Debit Card";
	}
	
	@Override
	public void selectPaymentMethod() {
		System.out.println("Method to carry out transactions using Credit or Debit Card.");
	}

}

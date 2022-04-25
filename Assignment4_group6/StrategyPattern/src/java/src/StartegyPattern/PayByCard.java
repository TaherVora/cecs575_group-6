package StartegyPattern;

public class PayByCard implements PaymentStrategies{
    private CreditCard card;
    @Override
    public void getPaymentInfo() {
        card = new CreditCard("cardNumber", "expiry", "cvv");
        System.out.println("Processing Card Details...");
    }
    @Override
    public boolean validatePayment() {
        // Validate credit card...
        System.out.println("Validating Card Details: " + card.getCardNumber() +"  "+ card.getExpiry() + "  " + card.getCvv());
        return true;
    }
    @Override
    public void processPayment(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount();
    }
}

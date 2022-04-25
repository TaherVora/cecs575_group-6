package StartegyPattern;

public interface PaymentStrategies {

    void getPaymentInfo();
    boolean validatePayment();
    void processPayment(int amount);

}

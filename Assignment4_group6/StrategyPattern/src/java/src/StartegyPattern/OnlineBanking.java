package StartegyPattern;

public class OnlineBanking implements PaymentStrategies {
    private String userid;
    private String password;
    @Override
    public void getPaymentInfo() {
        // Pop-up to collect PayPal mail and password...
        userid = "User ID";
        password = "Password ";
        System.out.println("Collecting User bank Account Details...");
    }

    @Override
    public boolean validatePayment() {
        // Validate account...
        System.out.printf("Validating User Details Info: %s | %s%n", userid, password);
        return true;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Paying " + amount + " using online banking");
    }
}

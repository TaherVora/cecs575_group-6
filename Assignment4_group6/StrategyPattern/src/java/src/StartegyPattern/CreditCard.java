package StartegyPattern;

public class CreditCard {
    private String cardNumber;
    private final String expiry;
    private final String cvv;
    private int amount;

    public CreditCard(String cardNumber1, String expiry1, String cvv1) {
        this.cardNumber = cardNumber1;
        this.expiry = expiry1;
        this.cvv = cvv1;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(){
         this.amount = 1000;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public String getExpiry(){
        return expiry;
    }
    public String getCvv(){
        return cvv;
    }
}

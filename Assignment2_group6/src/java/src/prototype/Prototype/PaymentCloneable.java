package prototype.Prototype;

public abstract class PaymentCloneable implements Cloneable {
     
    protected String paymentType;
      
    public abstract void selectPaymentMethod();
      
    public Object clone() {
    	
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
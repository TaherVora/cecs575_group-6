package abstractFactory.Marketplace;

public class Electronics extends Products {

    private int quantity;
    private float price;
    private String productStatus;
    private String description;

    public Electronics(int quantity, float price, String productStatus, String description){
        this.quantity = quantity;
        this.price = price;
        this.productStatus = productStatus;
        this.description = description;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public float getPrice() {
        //Electronics sales tax is 18 % so multiplying them using 0.18 of the price and add it to total price
        return (float) ((this.price + this.price * 0.05) *this.quantity);
    }

    @Override
    public String getProductStatus() {
        // in real time application we will call the database to check the product status is it sold or not based on no of items avaliable
        return this.productStatus;
    }
    public String getDescription() {
        return this.description;
    }
}
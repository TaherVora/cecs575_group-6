// This is a abstract class
package abstractFactory.Marketplace;

public abstract class Products {

    public abstract int getQuantity();
    public abstract float getPrice();
    public abstract String getProductStatus();
    public abstract String getDescription();

    @Override
    public String toString(){
        return " Quantity = "+this.getQuantity()+ "\n Price per Item = "+ this.getPrice() / this.getQuantity()  +"\n Price = "+this.getPrice()+"\n Product Status = "+this.getProductStatus() + "\n Product Description = " + this.getDescription();
    }
}

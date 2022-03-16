// This is a Factory Class
package abstractFactory.ProductCatlog;

import abstractFactory.Marketplace.Electronics;
import abstractFactory.Marketplace.Furniture;
import abstractFactory.Marketplace.Products;

public class ProductDisplay {

    public static Products getProducts(String category, int quantity, float price, String productStatus,String description){
        if("ele".equalsIgnoreCase(category)) return new Electronics(quantity, price, productStatus, description);
       else if("fur".equalsIgnoreCase(category)) return new Furniture(quantity, price, productStatus,description);
        return null;
    }
}

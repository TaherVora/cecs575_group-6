package inventorySubsystem;
import java.util.HashMap;
import java.util.Map;
public class Stock {
    Map<Integer, Integer> map;
    public Stock() {
        map = new HashMap<>();
        for(int i=0; i<5000; i++)
        map.put(i, 5);
    } 
    public int checkItemAvailability(int productId) {
        if(map.containsKey(productId)) {
            if(map.get(productId) > 0) {
                updateStock(productId);
                Product obj = new Product();
                int amount = obj.productAmount(productId);
                return amount;
            }    
            else
                return 0;
        }
        else 
            return -1;
    }
    private void updateStock(int productId) {
        if(map.get(productId) > 0)
            map.put(productId, map.get(productId)-1);
    }
}

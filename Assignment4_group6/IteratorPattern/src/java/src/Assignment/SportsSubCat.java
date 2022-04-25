package Assignment;

public class SportsSubCat implements Container{
    private String products[] = {"Athletic Clothing" , "Hunting" ,"Fishing" , "Golf"};

    @Override
    public Iterator getIterator() {
       return new ProductsIterator();
    }

    private class ProductsIterator implements Iterator {

       int index;

       @Override
       // indicates whether there are more elements to iterate over
       public boolean hasNext() {
       
          if(index < products.length){
             return true;
          }
          return false;
       }

       @Override
       // returns next element in the products array and increment index
       public Object next() {
       
          if(this.hasNext()){
             return products[index++];
          }
          return null;
       }		
    }

}

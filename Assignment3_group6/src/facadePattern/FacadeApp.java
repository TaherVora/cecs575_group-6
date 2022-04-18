// Implementation of Facade Design Pattern
// Client App
import java.util.Scanner;

public class FacadeApp{
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade ();
        Scanner sc = new Scanner(System.in);
        char choice = 'y'; // app will continue to run until choice is y/Y
        while(choice == 'y' || choice == 'Y') {
            // client will input the product ID to order and purchase 
            System.out.println("Enter the product ID to be purchased:");
            int pId = sc.nextInt();
            facade.placeOrder(pId); // // calling Facade
            System.out.println("Do you want to enter more (y/n): "); // returning from Facade
            choice = sc.next().charAt(0);   
        }
        
        sc.close();
   }
}
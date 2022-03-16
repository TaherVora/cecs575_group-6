import java.util.Scanner;
import prototype.Drivers.PaymentStore;
import abstractFactory.Marketplace.Products;
import abstractFactory.ProductCatlog.ProductDisplay;
import singletonClass.Admin;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            //Singleton Pattern Implementation
            System.out.println("Implementation of Singleton Class (Admin Class):");
            System.out.println("Enter Admin ID");
            String adminID = in.nextLine();
            System.out.println("Enter Admin Password");
            // Admin Password will be hidden when entered
            char[] pw = System.console().readPassword();
            String password = new String(pw);
            // Singleton class method to create unique instance
            Admin.getInstance(adminID, password);
            System.out.println();

            //Abstract Factory Implementation
            System.out.println("Implementation of Abstract Factory Pattern (Products Class):");
            System.out.println();
            Products pc = ProductDisplay.getProducts("ele",2,500 ,"In stock"," This a 2gb computer");
            Products chair = ProductDisplay.getProducts("fur",16,100 ,"In stock","This chair is comfortable for children");
            System.out.println("Final Price After Electronics Sales Tax::\n"+pc);
            System.out.println("Final Price After Furniture Sales Tax::\n"+chair);
            System.out.println();

            //Prototype Pattern Implementation
            System.out.println("Implementation of Prototype Pattern (Payment Class):");
            System.out.println();
            PaymentStore.getPaymentType("Credit/Debit Card").selectPaymentMethod();
            PaymentStore.getPaymentType("Netbanking Payment").selectPaymentMethod();
            PaymentStore.getPaymentType("Paypal Payment").selectPaymentMethod();
            PaymentStore.getPaymentType("Netbanking Payment").selectPaymentMethod();
        }
        finally {
            in.close();}
    }
}






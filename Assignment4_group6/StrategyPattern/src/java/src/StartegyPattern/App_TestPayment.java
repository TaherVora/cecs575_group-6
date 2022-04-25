/*
    Java implementation of strategy pattern
*/
package StartegyPattern;

public class App_TestPayment {

    public static void main(String[] args){
        System.out.println("Test 1 Using Card");
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new PayByCard());
        paymentService.processOrder(10444);
        System.out.println("=========================================");
        System.out.println("Test 2 Using Online payment");
        paymentService.setStrategy(new OnlineBanking());
        paymentService.processOrder(1005);

    }
}

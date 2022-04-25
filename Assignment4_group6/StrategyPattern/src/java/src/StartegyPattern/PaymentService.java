package StartegyPattern;

public class PaymentService {

    private int cost;

    private PaymentStrategies strategy;

        public void processOrder(int cost) {
            this.cost = cost;
            strategy.getPaymentInfo();
            if (strategy.validatePayment()) {
                strategy.processPayment(getTotal());
            }
        }
        private int getTotal() {
            boolean includeDelivery = true;
            return includeDelivery ? cost + 10 : cost;
        }


    public void setStrategy(PaymentStrategies strategy) {
        this.strategy = strategy;
    }
}


public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy var1) {
        this.paymentStrategy = var1;
    }

    public void executePayment(double var1) {
        this.paymentStrategy.pay(var1);
    }
}

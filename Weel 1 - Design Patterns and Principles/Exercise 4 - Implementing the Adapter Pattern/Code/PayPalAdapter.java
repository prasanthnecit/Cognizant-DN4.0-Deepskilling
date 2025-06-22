class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway var1) {
        this.payPalGateway = var1;
    }

    public void processPayment(double var1) {
        this.payPalGateway.payWithPayPal(var1);
    }
}

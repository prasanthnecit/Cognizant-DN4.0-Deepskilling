class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway var1) {
        this.stripeGateway = var1;
    }

    public void processPayment(double var1) {
        this.stripeGateway.makePayment(var1);
    }
}
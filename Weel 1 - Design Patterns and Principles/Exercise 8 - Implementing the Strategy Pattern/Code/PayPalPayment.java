public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String var1, String var2) {
        this.email = var1;
        this.password = var2;
    }

    public void pay(double var1) {
        System.out.println("Paying " + var1 + " using PayPal.");
    }
}

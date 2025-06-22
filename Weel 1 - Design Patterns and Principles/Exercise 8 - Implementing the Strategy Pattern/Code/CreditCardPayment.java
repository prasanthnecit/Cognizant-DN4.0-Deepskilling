public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;

    public CreditCardPayment(String var1, String var2, String var3) {
        this.cardNumber = var1;
        this.cardHolderName = var2;
        this.cvv = var3;
    }

    public void pay(double var1) {
        System.out.println("Paying " + var1 + " using Credit Card.");
    }
}

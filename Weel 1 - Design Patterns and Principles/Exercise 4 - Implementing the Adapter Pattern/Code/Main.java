public class Main {
    public static void main(String[] var0) {
        PayPalGateway var1 = new PayPalGateway();
        StripeGateway var2 = new StripeGateway();
        PayPalAdapter var3 = new PayPalAdapter(var1);
        StripeAdapter var4 = new StripeAdapter(var2);
        var3.processPayment((double)8100.0F);
        var4.processPayment((double)1250.0F);
    }
}
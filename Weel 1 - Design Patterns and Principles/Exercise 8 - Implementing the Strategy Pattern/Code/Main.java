public class Main {
    public static void main(String[] var0) {
        PaymentContext var1 = new PaymentContext();
        CreditCardPayment var2 = new CreditCardPayment("9012-1704-5678-3456", "Prasanth", "303");
        var1.setPaymentStrategy(var2);
        var1.executePayment((double)930.0F);
        PayPalPayment var3 = new PayPalPayment("prasanth@gmail.com", "prasanthm1411");
        var1.setPaymentStrategy(var3);
        var1.executePayment((double)270.0F);
    }
}
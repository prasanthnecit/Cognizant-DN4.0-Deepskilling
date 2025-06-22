public class FinancialForecasting {
    public static double calculateFutureValue(double var0, double var2, int var4) {
        return var4 <= 0 ? var0 : calculateFutureValue(var0 * ((double) 1.0F + var2), var2, var4 - 1);
    }
}
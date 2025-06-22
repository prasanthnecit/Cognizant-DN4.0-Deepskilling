import java.util.*;

public class Main {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the initial value of the investment: ");
        double var2 = var1.nextDouble();
        System.out.print("Enter the annual growth rate (as a percentage, e.g., 5 for 5%): ");
        double var4 = var1.nextDouble() / (double)100.0F;
        System.out.print("Enter the number of years to forecast: ");
        int var6 = var1.nextInt();
        double var7 = FinancialForecasting.calculateFutureValue(var2, var4, var6);
        System.out.println("Future Value: " + var7);
        var1.close();
    }
}

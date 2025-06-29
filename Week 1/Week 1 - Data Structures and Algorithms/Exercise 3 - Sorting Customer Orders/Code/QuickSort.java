public class QuickSort {
    public static void quickSort(Order[] var0, int var1, int var2) {
        if (var1 < var2) {
            int var3 = partition(var0, var1, var2);
            quickSort(var0, var1, var3 - 1);
            quickSort(var0, var3 + 1, var2);
        }

    }

    private static int partition(Order[] var0, int var1, int var2) {
        Order var3 = var0[var2];
        int var4 = var1 - 1;

        for(int var5 = var1; var5 < var2; ++var5) {
            if (var0[var5].getTotalPrice() <= var3.getTotalPrice()) {
                ++var4;
                Order var6 = var0[var4];
                var0[var4] = var0[var5];
                var0[var5] = var6;
            }
        }

        Order var7 = var0[var4 + 1];
        var0[var4 + 1] = var0[var2];
        var0[var2] = var7;
        return var4 + 1;
    }
}

public class BubbleSort {
    public static void bubbleSort(Order[] var0) {
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1 - 1; ++var2) {
            for(int var3 = 0; var3 < var1 - var2 - 1; ++var3) {
                if (var0[var3].getTotalPrice() > var0[var3 + 1].getTotalPrice()) {
                    Order var4 = var0[var3];
                    var0[var3] = var0[var3 + 1];
                    var0[var3 + 1] = var4;
                }
            }
        }

    }
}

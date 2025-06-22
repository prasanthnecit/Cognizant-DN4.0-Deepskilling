public class BinarySearch {
    public static Book binarySearch(Book[] var0, String var1) {
        int var2 = 0;
        int var3 = var0.length - 1;

        while(var2 <= var3) {
            int var4 = var2 + (var3 - var2) / 2;
            int var5 = var0[var4].getTitle().compareToIgnoreCase(var1);
            if (var5 == 0) {
                return var0[var4];
            }

            if (var5 < 0) {
                var2 = var4 + 1;
            } else {
                var3 = var4 - 1;
            }
        }

        return null;
    }
}
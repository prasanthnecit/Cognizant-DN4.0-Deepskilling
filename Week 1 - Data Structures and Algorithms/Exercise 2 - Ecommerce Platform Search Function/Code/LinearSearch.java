public class LinearSearch {
    public static Product linearSearch(Product[] var0, String var1) {
        for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2].getProductId().equals(var1)) {
                return var0[var2];
            }
        }

        return null;
    }
}
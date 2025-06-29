public class LinearSearch {
    public static Book linearSearch(Book[] var0, String var1) {
        for(Book var5 : var0) {
            if (var5.getTitle().equalsIgnoreCase(var1)) {
                return var5;
            }
        }

        return null;
    }
}
public class Main {
    public static void main(String[] var0) {
        StockMarket var1 = new StockMarket();
        MobileApp var2 = new MobileApp("MobileApp_1");
        WebApp var3 = new WebApp("WebApp_1");
        var1.registerObserver(var2);
        var1.registerObserver(var3);
        var1.setStockPrice(98.2);
        var1.setStockPrice(120.8);
        var1.deregisterObserver(var2);
        var1.setStockPrice((double)105.0F);
    }
}

public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String var1) {
        this.appName = var1;
    }

    public void update(double var1) {
        System.out.println(this.appName + " received stock price update: " + var1);
    }
}

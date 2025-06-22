public class Main {
    public static void main(String[] var0) {
        Logger var1 = Logger.getInstance();
        Logger var2 = Logger.getInstance();
        var1.log("This is the first log message.");
        var2.log("This is the second log message.");
        if (var1 == var2) {
            System.out.println("Logger has a single instance.");
        } else {
            System.out.println("Logger has multiple instances.");
        }

    }
}
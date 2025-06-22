import java.util.*;

public class Main {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the message to send: ");
        String var2 = var1.nextLine();
        EmailNotifier var3 = new EmailNotifier();
        SMSNotifierDecorator var4 = new SMSNotifierDecorator(var3);
        SlackNotifierDecorator var5 = new SlackNotifierDecorator(var4);
        var5.send(var2);
        var1.close();
    }
}


public class Main {
    public static void main(String[] var0) {
        Light var1 = new Light();
        LightOnCommand var2 = new LightOnCommand(var1);
        LightOffCommand var3 = new LightOffCommand(var1);
        RemoteControl var4 = new RemoteControl();
        System.out.println("Light Status:");
        var4.setCommand(var2);
        var4.pressButton();
        System.out.println("Light Status:");
        var4.setCommand(var3);
        var4.pressButton();
    }
}
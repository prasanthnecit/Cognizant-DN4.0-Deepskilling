public class Main {
    public static void main(String[] var0) {
        Computer var1 = (new Computer.Builder("Intel i5", "8GB")).build();
        System.out.println("Basic Computer: " + String.valueOf(var1));
        Computer var2 = (new Computer.Builder("Intel i7", "16GB")).storage("1TB SSD").graphicsCard(true).wifi(true).build();
        System.out.println("Gaming Computer: " + String.valueOf(var2));
    }
}

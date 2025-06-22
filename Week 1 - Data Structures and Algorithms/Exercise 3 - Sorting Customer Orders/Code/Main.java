import java.util.*;

public class Main {
    public static void main(String[] var0) {
        Order[] var1 = new Order[]{new Order("O001", "Jeyakumar", (double)1300.25F), new Order("O002", "Charan Kumar", (double)1150.75F), new Order("O003", "Thejesh Babu", 5200.05), new Order("O004", "Surya Prakash", 2150.2)};
        System.out.println("Original Orders:");

        for(Order var5 : var1) {
            System.out.println(var5);
        }

        Order[] var8 = (Order[])Arrays.copyOf(var1, var1.length);
        BubbleSort.bubbleSort(var8);
        System.out.println("\nBubble Sorted Orders:");

        for(Order var6 : var8) {
            System.out.println(var6);
        }

        Order[] var10 = (Order[])Arrays.copyOf(var1, var1.length);
        QuickSort.quickSort(var10, 0, var10.length - 1);
        System.out.println("\nQuick Sorted Orders:");

        for(Order var7 : var10) {
            System.out.println(var7);
        }

    }
}

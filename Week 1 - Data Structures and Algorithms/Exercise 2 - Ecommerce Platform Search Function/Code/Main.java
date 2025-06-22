import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Apple iPhone 14", "Electronics"),
                new Product("P002", "Nike Air Max 270", "Footwear"),
                new Product("P003", "Samsung Galaxy S23", "Electronics"),
                new Product("P004", "Sony WH-1000XM4", "Audio")
        };

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        Product linearResult = LinearSearch.linearSearch(products, "P003");
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found"));

        Product binaryResult = BinarySearch.binarySearch(products, "P003");
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
    }
}
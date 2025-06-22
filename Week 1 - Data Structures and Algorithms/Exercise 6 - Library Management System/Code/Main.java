import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "Java Programming", "Author A"),
                new Book("B002", "Data Structures And Algorithms", "Author B"),
                new Book("B003", "Computer Networks", "Author C"),
                new Book("B004", "Database Management System", "Author D")
        };

        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        Book linearResult = LinearSearch.linearSearch(books, "Data Structures And Algorithms");
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Book not found"));

        Book binaryResult = BinarySearch.binarySearch(books, "Database Management System");
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Book not found"));
    }
}

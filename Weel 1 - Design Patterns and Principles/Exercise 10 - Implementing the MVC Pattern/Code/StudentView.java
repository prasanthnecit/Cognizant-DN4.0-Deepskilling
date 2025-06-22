import java.util.*;

public class StudentView {
    public void displayStudentDetails(String var1, String var2, String var3) {
        System.out.println("Student Details: ");
        System.out.println("Name: " + var1);
        System.out.println("ID: " + var2);
        System.out.println("Grade: " + var3);
    }

    public String getInput(String var1) {
        System.out.print(var1);
        return (new Scanner(System.in)).nextLine();
    }
}

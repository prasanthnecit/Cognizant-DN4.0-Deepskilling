//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] var0) {
        EmployeeManagementSystem var1 = new EmployeeManagementSystem(10);
        Employee var2 = new Employee("E001", "Jeyakumar", "Data Scientist", (double)676000.0F);
        Employee var3 = new Employee("E002", "Prithivi Raj", "Developer", (double)720000.0F);
        Employee var4 = new Employee("E003", "Charan Kumar", "Designer", (double)500000.0F);
        var1.addEmployee(var2);
        var1.addEmployee(var3);
        var1.addEmployee(var4);
        System.out.println("All Employees:");
        var1.traverseEmployees();
        System.out.println("\nSearching for Employee E002:");
        Employee var5 = var1.searchEmployee("E002");
        System.out.println(var5 != null ? var5 : "Employee not found");
        System.out.println("\nDeleting Employee E002:");
        var1.deleteEmployee("E002");
        var1.traverseEmployees();
    }
}
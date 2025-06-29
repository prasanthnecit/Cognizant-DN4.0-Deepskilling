public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(String var1, String var2, String var3, double var4) {
        this.employeeId = var1;
        this.name = var2;
        this.position = var3;
        this.salary = var4;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return "Employee [employeeId=" + this.employeeId + ", name=" + this.name + ", position=" + this.position + ", salary=" + this.salary + "]";
    }
}
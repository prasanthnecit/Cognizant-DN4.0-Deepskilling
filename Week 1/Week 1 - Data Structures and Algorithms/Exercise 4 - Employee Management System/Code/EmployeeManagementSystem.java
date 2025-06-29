public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int var1) {
        this.employees = new Employee[var1];
        this.size = 0;
    }

    public void addEmployee(Employee var1) {
        if (this.size < this.employees.length) {
            this.employees[this.size] = var1;
            ++this.size;
        } else {
            System.out.println("Array is full, cannot add more employees.");
        }

    }

    public Employee searchEmployee(String var1) {
        for (int var2 = 0; var2 < this.size; ++var2) {
            if (this.employees[var2].getEmployeeId().equals(var1)) {
                return this.employees[var2];
            }
        }

        return null;
    }

    public void traverseEmployees() {
        for (int var1 = 0; var1 < this.size; ++var1) {
            System.out.println(this.employees[var1]);
        }

    }

    public void deleteEmployee(String var1) {
        int var2 = -1;

        for (int var3 = 0; var3 < this.size; ++var3) {
            if (this.employees[var3].getEmployeeId().equals(var1)) {
                var2 = var3;
                break;
            }
        }

        if (var2 != -1) {
            for (int var4 = var2; var4 < this.size - 1; ++var4) {
                this.employees[var4] = this.employees[var4 + 1];
            }

            this.employees[this.size - 1] = null;
            --this.size;
        } else {
            System.out.println("Employee not found.");
        }

    }
}
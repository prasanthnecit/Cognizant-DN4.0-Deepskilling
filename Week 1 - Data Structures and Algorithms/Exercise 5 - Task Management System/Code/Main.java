public class Main {
    public static void main(String[] var0) {
        SinglyLinkedList var1 = new SinglyLinkedList();
        Task var2 = new Task("T001", "Design Homepage Layout", "Pending");
        Task var3 = new Task("T002", "Implement User Authentication", "In Progress");
        Task var4 = new Task("T003", "Deploy Application to Production", "Completed");
        Task var5 = new Task("T004", "Write Unit Tests", "In Progress");
        var1.addTask(var2);
        var1.addTask(var3);
        var1.addTask(var4);
        var1.addTask(var5);
        System.out.println("All Tasks:");
        var1.traverseTasks();
        System.out.println("\nSearching for Task T003:");
        Task var6 = var1.searchTask("T003");
        System.out.println(var6 != null ? var6 : "Task not found");
        System.out.println("\nDeleting Task T002:");
        var1.deleteTask("T002");
        var1.traverseTasks();
    }
}
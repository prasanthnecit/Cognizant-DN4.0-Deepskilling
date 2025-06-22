
public class SinglyLinkedList {
    private static class Node {
        Task task;
        Node next;

        Node(Task var1) {
            this.task = var1;
            this.next = null;
        }
    }
    private Node head;

    public void addTask(Task var1) {
        Node var2 = new Node(var1);
        if (this.head == null) {
            this.head = var2;
        } else {
            Node var3;
            for (var3 = this.head; var3.next != null; var3 = var3.next) {
            }

            var3.next = var2;
        }

    }

    public Task searchTask(String var1) {
        for (Node var2 = this.head; var2 != null; var2 = var2.next) {
            if (var2.task.getTaskId().equals(var1)) {
                return var2.task;
            }
        }

        return null;
    }

    public void traverseTasks() {
        for (Node var1 = this.head; var1 != null; var1 = var1.next) {
            System.out.println(var1.task);
        }

    }

    public void deleteTask(String var1) {
        if (this.head != null) {
            if (this.head.task.getTaskId().equals(var1)) {
                this.head = this.head.next;
            } else {
                for (Node var2 = this.head; var2.next != null; var2 = var2.next) {
                    if (var2.next.task.getTaskId().equals(var1)) {
                        var2.next = var2.next.next;
                        return;
                    }
                }

            }
        }
    }
}
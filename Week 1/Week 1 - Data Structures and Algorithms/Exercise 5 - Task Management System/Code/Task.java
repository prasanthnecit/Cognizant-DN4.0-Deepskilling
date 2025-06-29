public class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String var1, String var2, String var3) {
        this.taskId = var1;
        this.taskName = var2;
        this.status = var3;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return "Task [taskId=" + this.taskId + ", taskName=" + this.taskName + ", status=" + this.status + "]";
    }
}
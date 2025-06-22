public class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String var1, String var2, String var3) {
        this.name = var1;
        this.id = var2;
        this.grade = var3;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String var1) {
        this.id = var1;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String var1) {
        this.grade = var1;
    }
}

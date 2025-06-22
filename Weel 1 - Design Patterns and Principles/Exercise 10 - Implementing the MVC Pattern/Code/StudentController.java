public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student var1, StudentView var2) {
        this.model = var1;
        this.view = var2;
    }

    public void setStudentName(String var1) {
        this.model.setName(var1);
    }

    public String getStudentName() {
        return this.model.getName();
    }

    public void setStudentId(String var1) {
        this.model.setId(var1);
    }

    public String getStudentId() {
        return this.model.getId();
    }

    public void setStudentGrade(String var1) {
        this.model.setGrade(var1);
    }

    public String getStudentGrade() {
        return this.model.getGrade();
    }

    public void updateView() {
        this.view.displayStudentDetails(this.model.getName(), this.model.getId(), this.model.getGrade());
    }

    public void updateStudentDetails() {
        String var1 = this.view.getInput("Enter student name: ");
        String var2 = this.view.getInput("Enter student ID: ");
        String var3 = this.view.getInput("Enter student grade: ");
        this.setStudentName(var1);
        this.setStudentId(var2);
        this.setStudentGrade(var3);
    }
}

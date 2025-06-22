public class Main {
    public static void main(String[] var0) {
        Student var1 = new Student("Prasanth", "2215005", "O");
        StudentView var2 = new StudentView();
        StudentController var3 = new StudentController(var1, var2);
        var3.updateView();
        var3.updateStudentDetails();
        var3.updateView();
    }
}
public class Main {
    public static void main(String[] args) {

        Student student = new Student("101", "John Doe", "B");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);


        controller.updateView();


        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        
        controller.updateView();
    }
}










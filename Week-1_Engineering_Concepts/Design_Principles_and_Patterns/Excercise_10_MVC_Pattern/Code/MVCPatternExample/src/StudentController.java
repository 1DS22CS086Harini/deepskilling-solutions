
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Setters to update the model
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Getters to read from the model
    public String getStudentId() {
        return model.getId();
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    // Method to update the view
    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}
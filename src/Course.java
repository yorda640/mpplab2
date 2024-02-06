import java.util.ArrayList;
import java.util.List;

class Course {
    private String number;
    private String title;
    private Faculty faculty;
    private List<Student> enrolledStudents;

    public Course(String number, String title) {
        this.number = number;
        this.title = title;
        this.enrolledStudents = new ArrayList<>();
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addEnrolledStudent(Student student) {
        enrolledStudents.add(student);
    }
}


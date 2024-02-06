import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private double gpa;
    private List<Course> enrolledCourses;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();
    }

    public double getGpa() {
        return gpa;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addEnrolledStudent(this);
    }
}


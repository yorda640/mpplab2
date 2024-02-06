class StaffStudent extends Staff {
    private double gpa;
    private Course firstCourse;
    private boolean isFirstCourseSet;

    public StaffStudent(String name, String phone, int age, double salary, double gpa) {
        super(name, phone, age, salary);
        this.gpa = gpa;
        this.isFirstCourseSet = false;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFirstCourse(Course course) {
        if (!isFirstCourseSet) {
            firstCourse = course;
            isFirstCourseSet = true;
        }
    }

    public Course getFirstCourse() {
        return firstCourse;
    }
}


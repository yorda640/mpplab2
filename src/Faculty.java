class Faculty extends Employee {
    private int totalUnits;

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age, salary);
        this.totalUnits = 0;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void teachCourse(Course course, int units) {
        totalUnits += units;
        course.setFaculty(this);
    }
}

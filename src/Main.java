public class Main {
    public static void main(String[] args) {
        Department csDepartment = new Department("Computer Science");

        Faculty profSmith = new Faculty("John Smith", "123-456-7890", 40, 80000);
        Staff admin = new Staff("Bob Brown", "555-123-4567", 30, 50000);
        Student alice = new Student("Alice Johnson", "987-654-3210", 20, 3.5);
        StaffStudent staffStudent = new StaffStudent("Charlie Johnson", "555-111-2222", 35, 55000, 3.7);

        csDepartment.addMember(profSmith);
        csDepartment.addMember(admin);
        csDepartment.addMember(alice);
        csDepartment.addMember(staffStudent);

        Course cs101 = new Course("CS101", "Introduction to Computer Science");
        Course cs201 = new Course("CS201", "Data Structures");

        profSmith.teachCourse(cs101, 3);
        alice.enrollInCourse(cs101);
        alice.enrollInCourse(cs201);
        staffStudent.setFirstCourse(cs101);

        System.out.println("Total Salary of CS Department: $" + csDepartment.getTotalSalary());

        System.out.println("All Members in CS Department:");
        csDepartment.showAllMembers();

        System.out.println("Units Taught by Faculty:");
        csDepartment.unitsPerFaculty();

        System.out.println("Enrolled Courses for " + alice.getName() + ":");
        for (Course course : alice.getEnrolledCourses()) {
            System.out.println(course.getNumber() + " - " + course.getTitle());
        }

        System.out.println("First Course for " + staffStudent.getName() + ": " +
                staffStudent.getFirstCourse().getNumber() + " - " + staffStudent.getFirstCourse().getTitle());
    }
}

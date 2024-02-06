import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Person> members;

    public Department(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Person person : members) {
            if (person instanceof Employee) {
                totalSalary += ((Employee) person).getSalary();
            }
        }
        return totalSalary;
    }

    public void showAllMembers() {
        for (Person person : members) {
            System.out.println(person);
        }
    }

    public void unitsPerFaculty() {
        for (Person person : members) {
            if (person instanceof Faculty) {
                Faculty faculty = (Faculty) person;
                System.out.println("Faculty: " + faculty.getName() + ", Units Taught: " + faculty.getTotalUnits());
            }
        }
    }
}









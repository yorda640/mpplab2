class Employee extends Person {
private double salary;

public Employee(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        }

public double getSalary() {
        return salary;
        }
        }


class Person {
    private String name;
    private String phone;
    private int age;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Age: " + age;
    }
}


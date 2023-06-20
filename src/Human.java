public abstract class Human {
    protected String name;
    protected String lastName;
    protected int age;

    public Human(String name, String lastName, String patronymic) {
        this.name = name;
    }

    public Human(int studentId, String name) {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract Comparable<String> name();

    protected int getAge() {
        return age;
    }
}

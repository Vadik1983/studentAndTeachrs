import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>{

    private final LocalDate teacherId;

public Teacher(String name, String lastName, String patronymic, int age, LocalDate teacherId){
    super(name, lastName, patronymic, age);
    this.teacherId = teacherId;
}
    public LocalDate getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\'' +
                ", firstName='" + super.getName() + '\'' +
                ", secondName='" + super.getLastName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    @Override
    public Comparable<String> name() {
        return null;
    }
}
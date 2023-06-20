public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(int studentId, String name, String patronymic, String lastName, int age) {
        super(name, lastName,  patronymic, age);
        this.studentId = studentId;
           }

    public Student(int studentId, String name) {
        super(studentId,  name);
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getName() + '\'' +
                ", secondName='" + super.getLastName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
import java.util.List;

public class StudentGroupServise {
    ;
    private List<Student> students;
    private int studentID;
    public StudentGroupServise(int studentID, List<Student> students) {
        this.studentID = studentID;
        this.students = students;
    }

    public void addStudent( int studentID, String name){
        students.add(new Student(studentID++, name));
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student: students){
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }

}

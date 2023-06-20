import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller extends StudentGroupServise {
    public Controller(int studentID, List<Student> students) {
        super(studentID, students);
    }

    @Override
    public void addStudent(int studentID, String name) {
        super.addStudent(studentID, name);
        Map<Integer, String> studentsGroupe = new HashMap<>();

    }
}

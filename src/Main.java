import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        User Sidorovich = new Teacher("Вадим", "Олегович","Сидорович" , 40
                , LocalDate.now());
        User Varanelis = new Teacher( "Александр", "Вацлавович",
                "Варанелис", 61, LocalDate.now());
        User Kirikovski = new Teacher( "Игорь", "Анатольевич",
                "Кириковский", 55, LocalDate.now());

        Set<Human> set = new HashSet<>();
        set.add(Sidorovich);
        set.add(Varanelis);
        set.add(Kirikovski);

        System.out.println(Sidorovich);
    }
}
package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Igor", "Loskutnikov", 47));
        students.add(new Student(2, "Olga", "Loskutnikova",44));
        students.add(new Student(3, "Artem", "Loskutnikov",16));
        students.add(new Student(4, "Roman", "Loskutnikov",3.5));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

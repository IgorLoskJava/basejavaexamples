package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Igor", "Loskutnikov", 47));
        employees.add(new Employee(2, "Olga", "Loskutnikova",44));
        employees.add(new Employee(3, "Artem", "Loskutnikov",16));
        employees.add(new Employee(4, "Roman", "Loskutnikov",3.5));

        Collections.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println("Сортировка по Возрасту: " +employee);
        }

        Collections.sort(employees, new NameComparator());

        System.out.println("-".repeat(20));

        for (Employee employee : employees) {
            System.out.println("Сортировка по имени: " + employee);
        }

        System.out.println("-".repeat(20));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println("Сортировка по ID: " +employee);
        }

    }
}

package ComparatorExample;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    double age;

    public Employee(int id, String name, String surname, double age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.id, o.id);
    }
}

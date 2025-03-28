package ComparableExample;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    double age;

    public Student(int id, String name, String surname, double age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int compare = this.name.compareTo(o.name);
        if (compare == 0) {
            compare = this.surname.compareTo(o.surname);
        }
        return compare;
    }
}

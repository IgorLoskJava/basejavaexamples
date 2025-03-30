package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // ? - Wildcards, может быть подставлен любой класс.
        List<?> l = new ArrayList<Integer>(); // так писать можно
        List<Double> d = new ArrayList<>();
        d.add(1.0);
        d.add(2.0);
        d.add(3.0);
        show(d);

        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        show(str);

        ArrayList<Double> d2 = new ArrayList<>();
        d2.add(1.15);
        d2.add(2.46);
        d2.add(3.14);
        System.out.println(sum(d2));
    }

    static void show(List<?> list) {
        for (Object o : list) {
            System.out.println("My List: " + o);
        }
    }

    public static double sum(ArrayList<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }
}

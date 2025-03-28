package ParameterizedMethod;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(20);
        int a = GenericMethod.getSecondElement(list);
        System.out.println(a);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Igor");
        list1.add("Olga");
        list1.add("Artem");
        String a1 = GenericMethod.getSecondElement(list1);
        System.out.println(a1);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        double a2 = GenericMethod.getSecondElement(list2);
        System.out.println(a2);


    }
}

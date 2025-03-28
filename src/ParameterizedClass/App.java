package ParameterizedClass;

public class App {
    public static void main(String[] args) {
        ParameterizedClassEx1<String> parameterizedClassEx11 = new ParameterizedClassEx1<>("Hello");
        System.out.println(parameterizedClassEx11);
        String s = parameterizedClassEx11.getValue();
        System.out.println(s);

        ParameterizedClassEx2<String, Integer> info2 = new ParameterizedClassEx2<>("Igor", 47);
        System.out.println("Параметр 1: " + info2.getValue1());
        System.out.println("Параметр 2: " + info2.getValue2());

        ParameterizedClassEx3<String> info3 = new ParameterizedClassEx3<>("Hello", "World");
        System.out.println("Параметр 1: " + info3.getValue1());
        System.out.println("Параметр 2: " + info3.getValue2());
    }
}

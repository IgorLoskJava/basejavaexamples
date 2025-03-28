package ParameterizedClass;

public class ParameterizedClassEx1<T> {

    // T - type placeholder

    private T value;

    public ParameterizedClassEx1(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

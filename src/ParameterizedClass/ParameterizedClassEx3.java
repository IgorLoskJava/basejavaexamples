package ParameterizedClass;


public class ParameterizedClassEx3<V> {
    private V value1;
    private V value2;

    public ParameterizedClassEx3(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

}


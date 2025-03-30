package Subtyping;

public class App {
    public static void main(String[] args) {
        TestClass<Integer> testClass = new TestClass<>(150);
        /* TestClass<String> testClass1 = new TestClass<>("Privet")
        так писать нельля, т.к. T extends Number, могу быть только Сабклассы Number.
        */
    }
}

class TestClass<T extends Number> {
    /*
    extends Number & implements I1 & implements I2
    пишется так: <T extends Number&I1&I2>
    */
    private T t;

    public TestClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "t=" + t +
                '}';
    }
}


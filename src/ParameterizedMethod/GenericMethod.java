package ParameterizedMethod;

import java.util.ArrayList;

public class GenericMethod {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return (T) list.get(1);
    }
}

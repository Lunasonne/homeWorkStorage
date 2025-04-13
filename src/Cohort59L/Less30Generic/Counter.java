package Cohort59L.Less30Generic;
// Д/З. Написать generic метод, который считает, сколько раз заданный объект встречается в данном листе.
// Ваш метод должен работать с листом любого типа

import java.util.List;

public class Counter {

    public static <T> int numberOfRepetitions(List<T> list, T element) {
        int count = 0;
        for (T elementOfNewList : list) {
            if (elementOfNewList.equals(element)){
                count++;
            }

        }
        return count;
    }
}
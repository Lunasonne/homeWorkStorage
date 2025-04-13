package Cohort59L.Less30Generic.DomCounter;

import java.util.ArrayList;
import java.util.List;

public class MainCounter {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(7);
        numbers.add(3);
        numbers.add(7);
        numbers.add(11);
        numbers.add(3);
        numbers.add(3);
        numbers.add(11);
        numbers.add(11);
        System.out.println("запрашиваемое число содержится " + Counter.numberOfRepetitions(numbers, 7)+ " раза" );
        System.out.println("запрашиваемое число содержится " + Counter.numberOfRepetitions(numbers, 11)+ " раза" );
        System.out.println("запрашиваемое число содержится " + Counter.numberOfRepetitions(numbers, 3)+ " раза" );

    }
}

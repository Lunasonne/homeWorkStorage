package Cohort59L.Less35Iterable.DomDuplicate;

import java.util.ArrayList;
import java.util.List;

import static Cohort59L.Less35Iterable.DomDuplicate.DuplicateUtil.*;

public class Main {
    public static <MyList> void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("One");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Four");
        System.out.println(strings);
        System.out.println(hasDuplicate(strings));

     List<Person> list1 = new ArrayList<>();
        list1.add(new  Person("Harrison" , "Tom"));
        list1.add(new  Person("Jackson","Jack"));
        list1.add(new  Person("Wood","Isabella"));
        list1.add(new  Person("Johnson","John"));
        list1.add(new  Person("Austin","Ann"));
        list1.add(new  Person("Fisher","Ann"));
        System.out.println(list1);
        System.out.println(hasDuplicate( list1 ));

        List<Person> list2 = new ArrayList<>();
        list2.add(new  Person("Kelly","Mike"));
        list2.add(new  Person("Evans", "Marianna"));
        list2.add(new  Person("Fisher","Ann"));
        list2.add(new  Person("Harrison", "Tom"));
        list2.add(new  Person("Jackson","Jack"));
        System.out.println(list2);
        System.out.println(hasDuplicate( list2 ));

        System.out.println(deleteDuplicate(list1, list2));

        String stringName = "Jack, John, Nick, John";
        System.out.println(deleteDuplicateName(stringName));
    }
}
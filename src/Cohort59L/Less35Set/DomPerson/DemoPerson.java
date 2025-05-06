package Cohort59L.Less35Set.DomPerson;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DemoPerson {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person(10, "Tom", 20));
        list1.add(new Person(22, "Jack", 30));
        list1.add(new Person(65, "Kim", 23));
        list1.add(new Person(45, "John", 26));
        list1.add(new Person(10, "Tom", 20));
        list1.add(new Person(10, "Tom", 20));
        list1.add(new Person(22, "Jack", 30));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person(22, "Jack", 30));
        list2.add(new Person(48, "Lena", 41));
        list2.add(new Person(45, "John", 26));
        list1.add(new Person(23, "Ira", 22));

        Set<Person> person1 = new HashSet<>(list1);
        Set<Person> person2 = new HashSet<>(list2);

        person1.retainAll(person2);
        List<Person> list3 = new ArrayList<>(person1);
        System.out.println(list3);

        List<Person> list4 = new ArrayList<>(findDuplicate(list1) );
        System.out.println( list4);

    }

    public static Set<Person> findDuplicate(List<Person> list) {
        List<Person> transitory = new ArrayList<>();
        Set<Person> duplicates = new HashSet<>();
        for (Person person : list) {
            if (transitory.contains(person)) {
                duplicates.add(person);
            }
            else {
                transitory.add(person);
            }
        }
            return duplicates;
        }
   }

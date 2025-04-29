package Cohort59L.Less35Iterable.DomDuplicate;

//  Каждый team lead подал список сотрудников для получения премии.
// Но некоторые сотрудники работают на нескольких проектах и попали в списки несколько раз.
 // Итак, у вас есть несколько списков Person. Ваша задача помочь получить один общий список сотрудников, но без повторов.

import java.util.Objects;

public class Person {
    private String name;
    private String lastname;

    public Person(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return
                 lastname + " " + name ;
    }
}

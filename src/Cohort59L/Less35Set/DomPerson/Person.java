package Cohort59L.Less35Set.DomPerson;
import java.util.Objects;

public class Person {
        private int id;
        private String name;
        private int age;

    public Person( int id, String name, int age ) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return  "(id: "+ id + ", имя: " + name + ", возраст: "+ age+ " лет) " ;
    }


}

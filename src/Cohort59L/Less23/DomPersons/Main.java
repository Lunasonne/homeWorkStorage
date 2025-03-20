package Cohort59L.Less23.DomPersons;


public class Main {
    public static void main(String[] args) {

        Person[] allPerson = {
                new Person("Иванов", "Иван", 32, "xxxxxx@outlook.com"),
                new Person("Петров", "Олег", 45, "yyyyyy@outlook.com"),
                new Person("Сидоров", "Игорь", 50, "qqqqqq@outlook.com")};

        GetLName getLName = new GetLName ();
        info(allPerson, getLName);

        GetEmail getEmail = new GetEmail();
        info(allPerson, getEmail);

        info(allPerson, new GetAll());

    }
    public static void info (Person[] Person, GetData getData){
        System.out.println(getData.title());
        getData.get(Person);
    }
    }



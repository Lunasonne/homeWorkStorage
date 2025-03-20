package Cohort59L.Less23.DomPersons;
// Задан список Person {String fName, String lName, int age, String email}.
//Реализовать функции: получить списки всех lName, всех e-mail, строк вид “Jack Johnson; jack@mail.com” т.е. “fName lName; email”
public class Person {
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

        public String getfName() {
        return fName;
    }

    public String getEmail() {
        return email;
    }

       public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return  "имя: " + fName +  " фамилия: " + lName  + " возраст: " + age + " эл. почта: " + email;
    }
}

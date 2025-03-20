package Cohort59L.Less23.DomPersons;

public class GetEmail implements GetData {

    @Override
    public void get(Person[] person) {

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getEmail());
        }
    }

    public String title () {
        return "список эл.почт: ";
    }
}



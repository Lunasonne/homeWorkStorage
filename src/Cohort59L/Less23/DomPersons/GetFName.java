package Cohort59L.Less23.DomPersons;

public class GetFName implements GetData {

    @Override
    public void get(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getfName());
        }
    }

    @Override
    public String title() {
        return "список фамилий";
    }
}

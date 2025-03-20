package Cohort59L.Less23.DomPersons;

public class GetAll implements GetData{


    @Override
    public void get(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getlName()+ " " + person[i].getfName() +", " +  person[i].getEmail());
        }
    }

    @Override
    public String title() {
        return "";
    }
}

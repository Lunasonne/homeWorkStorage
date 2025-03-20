package Cohort59L.Less23.DomPersons;

public class GetLName implements GetData {

    @Override
    public void get(Person[] person) {

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getlName());
        }

            }

        public String title () {
            return "список имен: ";
        }
    }

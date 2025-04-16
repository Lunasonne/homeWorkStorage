package Cohort59L.Less30Generic.DomManager;

public class Employee {
    private String name;
    private String lastName;

    public Employee(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void timetable() {
        System.out.println("рабочий день с 9.00 до 18.00. Выходные дни: суббота и воскресенье");
    }

        public void duty(){
            System.out.println(getName() +" "+ getLastName()+ " пишет код и выполняет указания менеджера, ");
        }

    }


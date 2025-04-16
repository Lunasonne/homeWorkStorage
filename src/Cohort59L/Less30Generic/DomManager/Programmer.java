package Cohort59L.Less30Generic.DomManager;

public class Programmer extends Employee{

    public Programmer(String lastName, String name) {
        super(lastName, name);
    }

    @Override
    public void duty() {
        System.out.println(getName() +" "+ getLastName()+ " пишет программы для проектов отдела программистов, "); ;
    }

    @Override
    public void timetable() {
        super.timetable();
    }
}
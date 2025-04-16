package Cohort59L.Less30Generic.DomManager;

public class QAEngineer extends Employee{

    public QAEngineer(String lastName, String name) {
        super(lastName, name);
    }

    @Override
    public void duty() {
        super.duty();
        System.out.println( "обеспечивает ПО, проводит тестирование");
    }

    @Override
    public void timetable()
    {
        System.out.println("рабочий день- ненормированный, рабочее место: Home office");;
    }
}

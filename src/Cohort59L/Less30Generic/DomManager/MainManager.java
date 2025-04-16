package Cohort59L.Less30Generic.DomManager;

import Cohort59L.Less17Inheritance.Employee.Employee;

public class MainManager {
    public static void main(String[] args) {

        Manager <Programmer> programmerManager = new Manager<>("Programmer");
        Manager <QAEngineer> qaMmanager = new Manager<>("QAEngineer");


        programmerManager.addEmployeeToTeam(new Programmer("Rita", "Triz"));
        programmerManager.addEmployeeToTeam(new Programmer("Konrad", "Lim" ));
        programmerManager.addEmployeeToTeam(new FrontEnd( "Prinston", "Oliver" ));
        programmerManager.addEmployeeToTeam(new FrontEnd("Ivanov", "Ivan"));
        programmerManager.addEmployeeToTeam(new BackEnd("Moleeva", "Margo"));
        programmerManager.addEmployeeToTeam(new BackEnd("Wond", "Ludvig"));
        programmerManager.PrintTeam();

        qaMmanager.addEmployeeToTeam(new QAEngineer("Motro", "Nick"));
        qaMmanager.addEmployeeToTeam(new QAEngineer("Smirnoff", "Nikolay" ));
        qaMmanager.PrintTeam();

        qaMmanager.getWork();
        programmerManager.getWork();


    }
}

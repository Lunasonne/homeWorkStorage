package Cohort59L.Less30Generic.DomManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Необходимо реализовать класс Manager, содержащий информацию о команде, которой управляет Manager.
//  У Manager должен быть список (List) членов команды.
// Oпределяем “специализацию менеджера” т.е.командой каких специалистов он может руководить:
// Например, только тестировщиками, или только программистами, или только фронт-энд программистами.
// (Programmer, QA Engineer, BackEnd Programmer, FrontEnd Programmer)
//Реализуйте метод добавления работника в команду. Естественно, в команду Programmer не должно быть возможным добавить QAEngineer

public class Manager<T extends Employee> {

    private String specialization;
    private List<T> team;


    public Manager(String specialization) {
        this.specialization = specialization;
        this.team = new ArrayList<>();

    }

    public String getSpecialization() {
        return specialization;
    }

    public List<T> getTeam() {
        return team;
    }

    public void addEmployeeToTeam(T employee) {
        team.add(employee);

    }

    public void PrintTeam() {
        System.out.println(" Состав команды менеджера по " + getSpecialization() + " :");
        for (Employee employee : team) {
            System.out.println(employee.getName() + " " + employee.getLastName());
        }
    }
public void getWork () {
    for  (Employee employee : team) {
        employee.duty();
        employee.timetable();


    }
}}
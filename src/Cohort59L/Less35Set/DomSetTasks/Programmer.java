package Cohort59L.Less35Set.DomSetTasks;

import java.util.List;

public class Programmer {
    private String name;
    private String city;
    private List<Task> tasks;

    public Programmer(String name, String city,  List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

}



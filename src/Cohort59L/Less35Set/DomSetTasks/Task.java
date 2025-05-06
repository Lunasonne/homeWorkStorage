package Cohort59L.Less35Set.DomSetTasks;

import java.util.Objects;

public class Task {
    private int number;
    private String description;
    private String status;
    private int dayInProcessing;


    public Task(int number, String description, String status, int dayInProcessing ) {
        this.number = number;
        this.description = description;
        this.status = status;
        this.dayInProcessing = dayInProcessing;

    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return number == task.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return "задача № " + number + ": " + description +", " +  status +", "+  dayInProcessing + " дней в работе ";

    }




}

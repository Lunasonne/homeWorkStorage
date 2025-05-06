package Cohort59L.Less35Set.DomSetTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoProgrammer {
    public static void main(String[] args) {
        Task task1 = new Task(1, "identify bugs", "на исполнении", 14);
        Task task2 = new Task(2, "coding", "на исполнении", 5);
        Task task3 = new Task(3, "document", "в обработке", 3);
        Task task4 = new Task(4, "Git", "исполнено", 1);
        Task task5 = new Task(5, "QA", "на исполнении", 14);

        Programmer alex = new Programmer("Alex", "Berlin", List.of(task1, task2, task5));
        Programmer alis = new Programmer("Alis", "London", List.of(task3, task2, task5));
        Programmer katrin = new Programmer("Katrin", "Madrid", List.of(task1, task2, task5, task4));

        List<Programmer> allProgrammers = List.of(alex, alis, katrin);

        Set<Task> uniqueTasks = new HashSet<>();
        for (Programmer programmer : allProgrammers) {
            uniqueTasks.addAll(programmer.getTasks());

        }
        System.out.println("список задач: " + new ArrayList<>( uniqueTasks));
    }
}

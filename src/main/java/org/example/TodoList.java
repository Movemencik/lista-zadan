package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Zadanie usunięte.");
        } else {
            System.out.println("Niepoprawny numer zadania.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void displayTasks() {
        if (getTasks().isEmpty()) {
            System.out.println("Brak zadań na liście.");
        }
        else {
            System.out.println("==== Obecne zadania ====");
            for (int i = 0; i < getTasks().size(); i++) {
                Task t = getTasks().get(i);
                System.out.println((i + 1) + ". " + t.getName());
            }
        }
    }
}
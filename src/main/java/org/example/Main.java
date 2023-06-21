package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("");
            System.out.println("==== LISTA ZADAŃ ====");
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Usuń zadanie");
            System.out.println("3. Obecne zadania");
            System.out.println("4. Wyjdź");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Podaj treść zadania: ");
                    String name = scanner.nextLine();
                    Task task = new Task(name);
                    todoList.addTask(task);
                    System.out.println("Zadanie dodane.");
                    break;
                case "2":
                    System.out.print("Podaj numer zadania do usunięcia: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    todoList.removeTask(index);
                    System.out.println("Zadanie usunięte.");
                    break;
                case "3":
                    System.out.println("Obecne zadania:");
                    for (int i = 0; i < todoList.getTasks().size(); i++) {
                        Task t = todoList.getTasks().get(i);
                        System.out.println((i + 1) + ". " + t.getName());
                    }
                    break;
                case "4":
                    System.out.println("Zakończono program.");
                    System.exit(0);
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                    break;
            }

        }
    }
}
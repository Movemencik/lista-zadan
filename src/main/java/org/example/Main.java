package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            printMenu();

            String option = scanner.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.print("Podaj treść zadania: ");
                    String name = scanner.nextLine();
                    Task task = new Task(name);
                    todoList.addTask(task);
                    System.out.println("Zadanie dodane.");
                }
                case "2" -> {
                    if (todoList.getTasks().isEmpty()) {
                        System.out.println("Brak zadań na liście.");
                    } else {
                        todoList.displayTasks();
                        boolean istrue = false;
                        int index = 0;
                        while (!istrue) {
                            try {
                                System.out.print("Podaj numer zadania do usunięcia: ");
                                String input = scanner.nextLine();
                                index = Integer.parseInt(input);
                                istrue = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Niepoprawana wartość");
                            }
                        }
                        todoList.removeTask(index);
                    }
                }
                case "3" -> todoList.displayTasks();
                case "4" -> {
                    System.out.println("Zakończono program.");
                    System.exit(0);
                }
                default -> System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }

        }
    }

    private static void printMenu() {
        System.out.println("==== LISTA ZADAŃ ====");
        System.out.println("1. Dodaj zadanie");
        System.out.println("2. Usuń zadanie");
        System.out.println("3. Wyświetl zadania");
        System.out.println("4. Wyjdź");
        System.out.print("Wybierz opcję: ");
    }
}
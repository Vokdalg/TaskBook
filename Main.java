import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int usersChoice = Menu.printMenu(scanner);
            scanner.nextLine();
            switch (usersChoice) {
                case 0:
                    return;
                case 1:
                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        String newTask = scanner.nextLine();
                        if (newTask.equals("end")) {
                            break;
                        } else {
                            TasksBook.addTask(newTask);
                        }
                    }
                    break;
                case 2:
                    TasksBook.showTaskBook();
                    break;
                case 3:
                    while (true) {
                        TasksBook.showTaskBook();
                        System.out.println("Введите номер задачи, которую хотите удалить (для завершения введите Finish)");
                        String deletingTask = scanner.nextLine();
                        if (deletingTask.equals("Finish")) {
                            break;
                        } else {
                            int taskNumber;
                            try {
                                taskNumber = Integer.parseInt(deletingTask);
                                try {
                                    TasksBook.deleteTask(taskNumber);
                                } catch (IndexOutOfBoundsException exception) {
                                    System.out.println("Такой задачи не существует!");
                                }
                            } catch (NumberFormatException exception) {
                                System.out.println("Некорректный ввод! Введите номер задачи, которую хотите удалить (для завершения введите Finish)");
                            }
                        }
                    }
                default:
                    System.out.println("Некорректный вариант ввода!");
            }
        }
    }
}


import java.util.ArrayList;

public class TasksBook {

    private static ArrayList<String> tasksBook = new ArrayList<>();

    protected static void addTask(String newTask) {
        tasksBook.add(newTask);
        System.out.println("Задача успешно добавлена!");
    }

    protected static void showTaskBook() {
        System.out.println("Список задач:");
        for (int i = 0; i < tasksBook.size(); i++) {
            System.out.println((i + 1) + "." + " " + tasksBook.get(i));
        }
    }

    protected static void deleteTask(int task) {
        tasksBook.remove(task - 1);
    }
}

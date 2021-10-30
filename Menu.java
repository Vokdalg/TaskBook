import java.util.Scanner;

public class Menu {
    protected static int printMenu(Scanner scanner) {
        System.out.print("Выберите действие:\n" +
                         "1. Добавить задачу\n" +
                         "2. Вывести список задач\n" +
                         "3. Удалить задачу\n" +
                         "0. Выход\n");
        return scanner.nextInt();
    }
}

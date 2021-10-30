import java.util.Scanner;

public class Menu {
    protected static int printMenu(Scanner scanner) {
        System.out.print("""
                Выберите действие:
                1. Добавить задачу
                2. Вывести список задач
                3. Удалить задачу
                0. Выход
                """);
        return scanner.nextInt();
    }
}

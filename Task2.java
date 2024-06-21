import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем первую строку
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();

        // Запрашиваем вторую строку
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        // Сравниваем строки
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Закрываем Scanner
        scanner.close();
    }
}

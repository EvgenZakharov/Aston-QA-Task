import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        // Вывод результатов операций
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + a / b);
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        // Закрытие сканера
        scanner.close();
    }
}



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число (b): ");
        int b = scanner.nextInt() ;
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double quotient;
        if (b != 0) {
            quotient = (double) a / b;
            System.out.println("a / b = " + quotient);
        } else {
            System.out.println("Деление на ноль недопустимо.");
        }
        System.out.println("Сумма (a + b): " + sum);
        System.out.println("Разность (a - b): " + diff);
        System.out.println("Произведение (a * b): " + product);
        scanner.close();
    }
}
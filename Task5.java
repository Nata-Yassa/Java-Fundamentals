package maintask;

// Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter number of 1 to 12: ");
        Scanner scanner = new Scanner(System.in);
        int n;
        while (!scanner.hasNextInt()) {
            System.out.println("Enter number of 1 to 12! ");
            scanner.next();
        }
        while (!Test(n = scanner.nextInt())) {
            System.out.println("Enter number of 1 to 12! ");
        }
        if (n == 1) {
            System.out.println("It is January!");
        } else if (n == 2) {
            System.out.println("It is February!");
        } else if (n == 3) {
            System.out.println("It is March!");
        } else if (n == 4) {
            System.out.println("It is April!");
        } else if (n == 5) {
            System.out.println("It is May!");
        } else if (n == 6) {
            System.out.println("It is Juny!");
        } else if (n == 7) {
            System.out.println("It is July!");
        } else if (n == 8) {
            System.out.println("It is August!");
        } else if (n == 9) {
            System.out.println("It is September!");
        } else if (n == 10) {
            System.out.println("It is October!");
        } else if (n == 11) {
            System.out.println("It is November!");
        } else if (n == 12) {
            System.out.println("It is December!");
        }

    }

    public static boolean Test(int n) {
        if (n >= 1 && n <= 12) return true;
        else return false;
    }

}

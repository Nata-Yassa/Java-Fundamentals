package maintask;

import java.util.Scanner;

public class Task1 {
// Приветствовать любого пользователя при вводе его имени через командную строку

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Hello, " + string + "!");

    }

}

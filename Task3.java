package maintask;
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of random numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        int randomNumber;

        for (int i = 0; i < number; i++) {
            randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            randomNumber = (int) (Math.random() * 100);
            System.out.print(randomNumber + " ");
        }
    }
}

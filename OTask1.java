package optionaltask;

//Ввести n чисел с консоли.  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class OTask1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of numbers > ");
        int z = n.nextInt();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[z];
        System.out.print("Enter " + z + " numbers > ");
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
            //System.out.println(numbers[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }

        int r = 0;
        int t = min;

        while (t > 0){
            t = t / 10;
            r++;
        }

        System.out.println("The shortest number and its rank > " + min + " " + r);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        int r1 = 0;
        int t1 = max;

        while (t1 > 0){
            t1 = t1 / 10;
            r1++;
        }

        System.out.println("The longest number and its rank > " + max + " " + r1);

    }
}

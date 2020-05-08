package optionaltask;

//Ввести n чисел с консоли.
// Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

import java.util.Scanner;

public class OTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers > ");
        int z = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int[] num = new int[z];
        System.out.println("Enter " + z + " numbers > ");
        int[] sort = new int[z];
        int r = 0;
        int t;
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            t = num[i];
            r = 0;
            while (t > 0) {
                t = t / 10;
                r++;
            }
            sort[i] = r;
            System.out.print(sort[i] + " ");
        }
        System.out.println();
        double m = convertmedium(sort);
        System.out.println(m);
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] < m) {
                System.out.println(num[i] + " " + sort[i]);
            }

        }

    }
    private static double convertmedium(int[] array){
        int sum = 0;
        double res = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] ;
        }
        res = (double) sum / array.length;
        return res;
    }
}

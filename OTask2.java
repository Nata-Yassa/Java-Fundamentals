package optionaltask;

//Ввести n чисел с консоли. Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class OTask2 {
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
        }

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1 - i; j++) {
                if (sort[j] > sort[j + 1]) {
                    swap(sort, j, j + 1);
                    swap(num, j, j + 1);
                }
            }
        }
        for (int j = 0; j < sort.length; j++) {
            System.out.print(num[j] + " ");
        }
    }

    private static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}


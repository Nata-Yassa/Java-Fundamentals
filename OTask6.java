package optionaltask;

//Ввести n чисел с консоли.
//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class OTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers > ");
        int z = scanner.nextInt();
        System.out.println("Enter " + z + " numbers > ");
        Scanner scanner1 = new Scanner(System.in);
        int[] num = new int[z];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner1.nextInt();
            char[] symbolArray = convertIntToCharArray(num[i]);
            int[] arrNum = convertCharArrayToIntArray(symbolArray);
            if (findNumberInAscendingOrder(arrNum)) {
                System.out.println(num[i]);
                break;
            }
        }
    }

    private static char[] convertIntToCharArray(int number) {
        String word = Integer.toString(number);
        char[] symbol = word.toCharArray();
        return symbol;
    }

    private static int[] convertCharArrayToIntArray(char[] array) {
        int[] arrOfSymbol = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrOfSymbol[i] = Character.getNumericValue(array[i]);
        }
        return arrOfSymbol;
    }

    private static boolean findNumberInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

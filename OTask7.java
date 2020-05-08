package optionaltask;

//Ввести n чисел с консоли.
//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class OTask7 {
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

            if (convertCharArrayToIntArray(symbolArray)){
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

    private static boolean convertCharArrayToIntArray(char[] array){
        int[] cifra = new int[10];
        int[] arrOfSymbol = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrOfSymbol[i] = Character.getNumericValue(array[i]);
        }
        for (int i = 0; i < arrOfSymbol.length; i++) {

            if (cifra[arrOfSymbol[i]] == 0){
                cifra[arrOfSymbol[i]] = 1;
            } else {
                return false;
            }
        }
        return true;
    }
}

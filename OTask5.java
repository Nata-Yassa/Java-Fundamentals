package optionaltask;

//Ввести n чисел с консоли.
//Найти количество чисел, содержащих только четные цифры,
//а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

import java.util.Scanner;

public class OTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers > ");
        int z = scanner.nextInt();
        System.out.println("Enter " + z + " numbers > ");
        Scanner scanner1 = new Scanner(System.in);
        int[] num = new int[z];
        int r = 0;
        int r1= 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner1.nextInt();
            char[] symbolArray = convertIntToCharArray(num[i]);
            int[] arrNum = convertCharArrayToIntArray(symbolArray);
            if (convertMultipleOfTwo(arrNum)){
                r++;
            }else if (convertcountingEvenOdd(arrNum)){
                r1++;
            }
        }

        System.out.println("Количество чисел, содержащих только четные цифры: "+ r);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: " +r1);
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

    private static boolean convertMultipleOfTwo(int[] array){
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean convertcountingEvenOdd(int[] array){
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        return even == odd;
    }
}

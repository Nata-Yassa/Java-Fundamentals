package maintask;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
//и вывести результат на консоль

public class Task4 {
    //public static void main(String[] args) {
    //   int sum = 0;
    // for (int i = 0; i < args.length; i++) {

    //   sum = sum + Integer.parseInt(args[i]);
    //}
    // System.out.println("Sum of numbers: " + sum);
    //}

    public static void main(String[] args) {
        int prod = 1;
        for (int i = 0; i < args.length; i++) {
            prod = prod * Integer.parseInt(args[i]);
        }
        System.out.println("Product of numbers: " + prod);
    }
}

package maintask;

//Отобразить в окне консоли аргументы командной строки в обратном порядке

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Command line arguments in reverse:");
        for (int i = args.length; i > 0 ; i--) {
             System.out.print(" " + i);
        }
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean exit = false;
        while(!exit) {
            System.out.println("choose task:");
            System.out.println("1. Task1;\n2. Task2;\n3. Task3;\n4. Task4.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Task1.test();
                    break;
                case 2:
                    Task2.test();
                    break;
                case 3:
                    Task3.test();
                    break;
                case 4:
                    Task4.test();
                    break;
                case -1:
                    exit = true;
                default:
                    System.out.println("there is no such option :(");
                    break;
            }
            System.out.println("========================================================================================\n\n\n\n\n");
        }
    }
}
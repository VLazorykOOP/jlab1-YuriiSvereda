import java.util.Scanner;

public class Task1 {
    public static double doubleDoubleFunction(double a, double b){
        double result = 0;
        result =  (((a*b - (a + b)*(a - b))/(Math.pow(b, 4) + Math.pow(a, 3))) + 5*b);
        return result;
    }
    public static double intDoubleFunction(int a, int b){
        double result = 0;
        result =  (((a*b - (a + b)*(a - b))/(Math.pow(b, 4) + Math.pow(a, 3))) + 5*b);
        return result;
    }
    public static int doubleIntFunction(double a, double b){
        int result = 0;
        result =  (int)(((a*b - (a + b)*(a - b))/(Math.pow(b, 4) + Math.pow(a, 3))) + 5*b);
        return result;
    }

    public static void test(){
        System.out.println("Lab 1 Java \n ");
        System.out.println("choose option: " +
                "\n\n 1.in — double \n out — double; " +
                "\n\n 2.in — int \n out — double;" +
                "\n\n 3.in — double \n out — int;");

        Scanner scanner = new Scanner(System.in);
        byte choice = scanner.nextByte();

        System.out.println("Enter your numbers:");
        switch (choice){
            case 1:{
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("result = " + doubleDoubleFunction(a, b));
                break;
            }
            case 2:{
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("result = " + intDoubleFunction(a, b));
                break;
            }
            case 3:{
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("result = " + doubleIntFunction(a, b));
                break;
            }
            default:
                System.out.println("there is no such option");
        }
    }
}

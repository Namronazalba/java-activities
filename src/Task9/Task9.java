package src.Task9;
import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println("Basic math operations 1:");
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        System.out.println("\nBasic math operations 2:");
        System.out.println("Addition: " + add(10, 15));
        System.out.println("Subtraction: " + subtract(50, 30));
        System.out.println("Multiplication: " + multiply(7, 6));
        System.out.println("Division: " + divide(17, 4));
    }
}

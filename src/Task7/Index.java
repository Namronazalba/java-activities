package src.Task7;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Index obj = new Index();

        while (true) {

            System.out.println("Input 'exit' to end OR press Enter to continue:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program end");
                break;
            }

            System.out.println("input two numbers to perform 4 basic arithmetic operations");

            System.out.print("input num 1: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("input num 2: ");
            int num2 = Integer.parseInt(sc.nextLine());

            System.out.println("--------------------------------");

            obj.addition(num1, num2);
            obj.subtraction(num1, num2);
            obj.multiplication(num1, num2);
            obj.division(num1, num2);

            System.out.println("==============================================");
        }

        sc.close();
    }

    public void addition(int  x, int y){
        System.out.println("Sum = " + (x+y));
    }
    
    public  void subtraction(int  x, int y){
        System.out.println("Difference = " + (x-y));
    }
    public void multiplication(int  x, int y){
        System.out.println("Product = " + (x*y));
    }
    public void division(int  x, int y){
        System.out.println("Quotient = " + ((double) x/y));
    }
}

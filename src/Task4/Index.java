package src.Task4;
import java.util.Scanner;
public class Index {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a string or 'exit' to quit: ");
        while (true) {

            String input = Scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }
            try {
                StringBuilder reversed = new StringBuilder(input).reverse();
                if (input.equals(reversed.toString())) {
                    System.out.println("The string is a palindrome.");
                    System.out.println("Enter another string or 'exit' to quit: ");
                } else {
                    System.out.println("The string is not a palindrome.");
                    System.out.println("Enter another string or 'exit' to quit: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a string or 'exit' to quit.");
            }
           

        }
         Scanner.close();

    }
}

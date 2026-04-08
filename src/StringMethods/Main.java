package src.StringMethods;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String or 'exit' to end program");
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program end.");
                break;
            }

            int inputLength = input.length();
            String uppercase = input.toUpperCase();
            String lowercase = input.toLowerCase();
            char firstChar = input.charAt(0);
            int indexLength = inputLength-1;
            char lastChar = input.charAt(indexLength);
            System.out.println(inputLength+", "+uppercase+", "+lowercase+", "+firstChar+", "+lastChar);
            
            if(input.length() >= 5){
                String substr = input.substring(1, 5);
                System.out.println(substr);
            }
        }
        scan.close();
    }
}
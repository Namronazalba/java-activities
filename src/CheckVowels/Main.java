package src.CheckVowels;

import java.util.Scanner;

class Main{
    static String checkVowels(char input){

        switch (Character.toLowerCase(input)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "vowel";    
            default:
                return "Consonant";

        }
  
    }
    public static void main(String[] args) {
        System.out.println("Input char");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String inputString = sc.nextLine();
            char inputChar = inputString.charAt(0);

            if (inputString.equalsIgnoreCase("exit")) {
                System.out.println("Program end.");
                break;
            }
            if (inputString.length() != 1) {
                System.out.println("Input char or 'exit' to end the program");
                continue;
            }

            System.out.println(checkVowels(inputChar));

        }
        sc.close();

    }
}
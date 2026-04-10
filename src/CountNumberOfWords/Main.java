package src.CountNumberOfWords;

import java.util.Scanner;

class Main{
    static int countNumOfWords(String x){
        String[] words = x.trim().split("\\s+");
        int count = words.length;
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Input words.");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input =  sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program end.");
                break;
            }
            
            System.out.println(countNumOfWords(input));
        }

        sc.close();
    }
}
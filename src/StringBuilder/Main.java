package src.StringBuilder;
import java.util.Scanner;

class Main{
    static String useString(StringBuilder input){
        int inputLeng = input.length();
        char firstChar = input.charAt(0);        
        char lastChar = input.charAt(inputLeng-1);
        int indexOfA = input.indexOf("a");
        String inputSubs = input.substring(3, 7);
        StringBuilder appendNums = new StringBuilder(input).append("123");
        StringBuilder insertString = new StringBuilder(input).insert(4, "xyz");
        StringBuilder deleteString = new StringBuilder(input).delete(2, 5);
        StringBuilder delCharAt = new StringBuilder(input).deleteCharAt(8);
        StringBuilder inputReverse = input.reverse();

        return "Length: " + inputLeng + 
        ", First: " + firstChar + 
        ", Last: " + lastChar + 
        ", Index A: " + indexOfA + 
        ", Substring: " + inputSubs + 
        ", Append 123: " + appendNums +
        ", Insert xyz: " + insertString +
        ", Delete Substring: " + deleteString+
        ", Delete Char at 8: " + delCharAt +
        ", Reverse: " + inputReverse;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string with at least 10 characters:");
        Scanner scan = new Scanner(System.in);


        while (true) {
            StringBuilder input = new StringBuilder(scan.nextLine());

            if (input.length() < 10) {
                System.out.println("Please enter a string with at least 10 characters:");
                continue;
            }
            if (input.toString().equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.println(useString(input));
            System.out.println("Enter another string (or type 'exit' to quit):");
        }
        scan.close();

    }
}
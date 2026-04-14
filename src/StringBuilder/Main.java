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
        // Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("testing lang");
        System.out.println(useString(sb));
    }
}
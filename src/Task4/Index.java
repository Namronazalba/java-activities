package src.Task4;

public class Index {


    public static void main(String[] args) {
        String input = "testing"; 
        StringBuilder reversed = new StringBuilder(input).reverse();
        if (input.equals(reversed.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}

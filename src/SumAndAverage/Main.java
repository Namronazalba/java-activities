package src.SumAndAverage;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter number separated with ',' or type exit to end.");
        try(Scanner scan = new Scanner(System.in)) {
          Processor processor = new Processor();
          processor.processInput(scan);
        } 
    }
    
}

class Processor{
    public void processInput(Scanner sc){
    while(true){
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("exit")){
            System.out.println("Program end.");
            break;
        }

        int[] nums = parseNumbers(input);
        int sum = calculateSum(nums);
        double avg = nums.length > 0 ? (double) sum/nums.length : 0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Enter new number");
    }
    }
    private int[] parseNumbers(String input){
        String[] splitrings = input.split(",");
        int[] tempArr = new int[splitrings.length];
        int count = 0;

        for(String splitString : splitrings){
            splitString = splitString.trim();
            if(!splitString.isEmpty()){
                try{
                    tempArr[count++]=Integer.parseInt(splitString);
                }catch(NumberFormatException e){
                    System.out.println("Invalid Input: " + splitString);
                }
            }
        }
        return Arrays.copyOf(tempArr, count);
    }

    private int calculateSum(int[] nums){
        int sum = 0;

        for(int num : nums){
            sum += num;
        }
        return  sum;
    }

}

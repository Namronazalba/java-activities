package src.Task8;

public class Index {

    public static void main(String[] args) {

        int[] nums = {4, 5, 10};

        for (int num : nums) {
            System.out.println("Total for " + num + " = " + sumUpTo(num));
        }
    }

    public static int sumUpTo(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
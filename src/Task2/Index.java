package src.Task2;

public class Index {
    static String printString(){
        char h = 'H';
        int e = 3;
        byte l = 1;
        byte o = 0;
        char w = 'W';
        char r = 'R';
        char d = 'D';
        float dec = 2.0f;
        boolean isTrue = true;

        String result = "" + h + e + l + l + o + " " 
                            + w + o + r + l + d + " " 
                            + dec + " " + isTrue;

        return result;
    }
    public static void main(String[] args) {

        System.out.println(printString());
    }
}

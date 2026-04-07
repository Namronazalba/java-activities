package src.Task3;

public class Index {

    public static void main(String[] args) {
        String a = new String("Wow").intern();
        String b = "Wow";
        String c = a + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}

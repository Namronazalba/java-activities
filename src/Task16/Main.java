package src.Task16;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
     @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        return timeToEat;
    }
    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed.");
    }
    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}

public class Main {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);
        g.groom();
        g.pet();
    }
}
package Tasksheet_1_3_1;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Extend Afritada -> Mechado
class Mechado extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste"
        };
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Extend Afritada -> Menudo
class Menudo extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Liver Spread",
            "Raisins",
            "Hotdog",
        };
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Extend Afritada -> Caldereta
class Caldereta extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Cheese"
        };
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

public class Tasksheet_1_3_1 {
    public static void main(String[] args) {

        // Polymorphism (parent reference, child object)
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // Display all ingredients
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
class Dinner {
    public String desert() {
        return "Eating displaying menuu";
    }

    public String Supper() {
        return desert() + " Today's recommendation is Chicken";
    }
}

class Breakfast {
    private Dinner dinner;

    Breakfast() {
        this.dinner = new Dinner();
    }

    public String display() {
        return dinner.desert();
    }

    public String breako() {
        return display() + " Boiled eggs and Sandwich";
    }
}

public class Main {
    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();
        System.out.println(breakfast.breako());  // Output: Eating displaying menuu Boiled eggs and Sandwich
    }
}

class Car {
    public double speed(int distance, int duration) {
        return (double) distance / duration;
    }

    public String color() {
        String clr = "Vlue";  
        return clr;
    }
}

class Lorry extends Car {
    public void acc() {
        double accele = 15 * speed(14, 35);
        System.out.println(accele);
    }

    public String color() {
        String clr = "pink";
        return clr;
    }
}

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.acc();
        System.out.println(lorry.color());  // Output: pink
    }
}

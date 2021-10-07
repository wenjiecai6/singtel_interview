package kingdom;

public class Chicken extends Bird{
    void sing() {
        System.out.println("Cluck, cluck");
    }
    void fly() {
        throw new UnsupportedOperationException("Unable to fly");
    }
}

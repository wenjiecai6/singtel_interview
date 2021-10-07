package kingdom.bird;

public class Chicken extends Bird{
    public void sing() {
        System.out.println("Cluck, cluck");
    }
    public void fly() {
        throw new UnsupportedOperationException("Unable to fly");
    }
}

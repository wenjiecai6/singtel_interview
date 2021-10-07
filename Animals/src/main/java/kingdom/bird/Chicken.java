package kingdom.bird;

import kingdom.Singable;

public class Chicken extends Bird implements Singable {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}

package kingdom.housepet;

import kingdom.Animal;
import kingdom.Singable;

public class Frog extends Animal implements Singable {
    @Override
    public void sing() {
        System.out.println("Crock");
    }
}

package kingdom.housepet;

import kingdom.Animal;
import kingdom.Singable;

public class Dog extends Animal implements Singable {
    @Override
    public void sing() {
        System.out.println("Bark");
    }
}

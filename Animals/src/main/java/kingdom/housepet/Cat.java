package kingdom.housepet;

import kingdom.Animal;
import kingdom.Singable;

public class Cat extends Animal implements Singable {
    @Override
    public void sing() {
        System.out.println("Meow");
    }
}

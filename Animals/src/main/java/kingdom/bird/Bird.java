package kingdom.bird;

import kingdom.Animal;
import kingdom.Flyable;
import kingdom.Singable;

public class Bird extends Animal implements Flyable, Singable {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
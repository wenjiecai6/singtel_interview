package kingdom.fish;

import kingdom.Animal;
import kingdom.Swimmable;

public class Dolphin extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}

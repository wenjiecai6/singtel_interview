package kingdom.bird;

import kingdom.Swimmable;

public class Duck extends Bird implements Swimmable {
    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}

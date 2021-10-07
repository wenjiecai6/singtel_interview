package kingdom.fish;

import kingdom.Animal;
import kingdom.Swimmable;

public class Fish extends Animal implements Swimmable {
    private String size;
    private String color;
    private boolean canEatOtherFish;
    private boolean canMakeJokes;

    public Fish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void walk() {
        throw new UnsupportedOperationException("Unable to walk");
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public boolean isCanEatOtherFish() {
        return false;
    }

    public boolean isCanMakeJokes() {
        return false;
    }
}

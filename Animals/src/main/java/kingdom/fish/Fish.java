package kingdom.fish;

import kingdom.Animal;

public abstract class Fish extends Animal {
    private String size;
    private String color;
    private boolean canEatOtherFish;
    private boolean canMakeJokes;

    public Fish(String size, String color){
        this.size = size;
        this.color = color;
    }
    public void walk(){
        throw new UnsupportedOperationException("Unable to walk");
    }
    public void swim() {
        System.out.println("I am swimming");
    }

    public abstract boolean isCanEatOtherFish();

    public abstract boolean isCanMakeJokes() ;
}

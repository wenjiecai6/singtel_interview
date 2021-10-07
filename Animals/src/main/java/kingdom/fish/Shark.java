package kingdom.fish;

import kingdom.Animal;

public class Shark extends Fish {
    public Shark() {
        super("large", "gray");
    }

    @Override
    public boolean isCanEatOtherFish() {
        return true;
    }

    @Override
    public boolean isCanMakeJokes() {
        return false;
    }
}

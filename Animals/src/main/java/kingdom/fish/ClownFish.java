package kingdom.fish;

public class ClownFish extends Fish {
    public ClownFish() {
        super("small", "orange");
    }

    @Override
    public boolean isCanEatOtherFish() {
        return false;
    }

    @Override
    public boolean isCanMakeJokes() {
        return true;
    }
}

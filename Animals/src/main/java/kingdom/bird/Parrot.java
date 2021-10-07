package kingdom.bird;

import kingdom.enums.ParrotType;

public class Parrot extends Bird {
    private final ParrotType parrotType;

    public Parrot(ParrotType parrotType) {
        this.parrotType = parrotType;
    }

    @Override
    public void sing() {
        System.out.println(parrotType.getSound());
    }
}

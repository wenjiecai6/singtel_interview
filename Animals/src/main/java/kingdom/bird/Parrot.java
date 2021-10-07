package kingdom.bird;

import kingdom.enums.ParrotType;

public class Parrot {
    private ParrotType parrotType;

    public Parrot(ParrotType parrotType){
        this.parrotType = parrotType;
    }

    public void sing() {
        System.out.println(parrotType.getSound());
    }
}

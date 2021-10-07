package kingdom.insect;

import kingdom.Animal;

public class Caterpillar extends Animal {
    private boolean haveMetamorphosised = false;

    public void fly() {
        if (haveMetamorphosised) {
            System.out.println("I am flying");
        } else {
            throw new UnsupportedOperationException("Unable to fly");
        }
    }

    public void walk() {
        if (haveMetamorphosised) {
            throw new UnsupportedOperationException("Unable to walk");
        } else {
            System.out.println("I am crawling");
        }
    }

    public void sing() {
        if (haveMetamorphosised) {
            System.out.println("");
        } else {
            System.out.println("I am singing");
        }
    }
}

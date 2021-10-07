package kingdom;

import kingdom.bird.*;
import kingdom.enums.ParrotType;
import kingdom.fish.ClownFish;
import kingdom.fish.Dolphin;
import kingdom.fish.Shark;
import kingdom.housepet.Cat;
import kingdom.housepet.Dog;
import kingdom.housepet.Frog;
import kingdom.insect.Caterpillar;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testBirdSing() {
        Bird bird = new Bird();
        bird.sing();
    }

    @Test
    public void testParrot() {
        Parrot parrot1 = new Parrot(ParrotType.LIVING_WITH_DOG);
        parrot1.sing();
        Parrot parrot2 = new Parrot(ParrotType.LIVING_WITH_CAT);
        parrot2.sing();
        Parrot parrot3 = new Parrot(ParrotType.LIVING_WITH_ROOSTER);
        parrot3.sing();
    }

    @Test
    public void testCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(ParrotType.LIVING_WITH_ROOSTER),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Caterpillar(),
                new Cat()
        };
        int flyableCnt = countFlyAble(animals);
        System.out.println("Number of animal that can fly: " + flyableCnt);
        int walkableCnt = countWalkable(animals);
        System.out.println("Number of animal that can walk: " + walkableCnt);
        int singableCnt = countSing(animals);
        System.out.println("Number of animal that can sing: " + singableCnt);
        int swimmableCnt = countSwimmable(animals);
        System.out.println("Number of animal that can swim: " + swimmableCnt);
    }

    private int countFlyAble(Animal[] animals) {
        int flyableCnt = 0;
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                try {
                    ((Flyable) animal).fly();
                    flyableCnt++;
                } catch (UnsupportedOperationException uoe) {
                    //ignore, because animal cannot fly
                }
            }
        }
        return flyableCnt;
    }

    private int countWalkable(Animal[] animals) {
        int walkableCnt = 0;
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                try {
                    ((Walkable) animal).walk();
                    walkableCnt++;
                } catch (UnsupportedOperationException uoe) {
                    //ignore, because animal cannot walk
                }
            }
        }
        return walkableCnt;
    }

    private int countSing(Animal[] animals) {
        int singableCnt = 0;
        for (Animal animal : animals) {
            if (animal instanceof Singable) {
                try {
                    ((Singable) animal).sing();
                    singableCnt++;
                } catch (UnsupportedOperationException uoe) {
                    //ignore, because animal cannot sing
                }
            }
        }
        return singableCnt;
    }

    private int countSwimmable(Animal[] animals) {
        int swimmableCnt = 0;
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                try {
                    ((Swimmable) animal).swim();
                    swimmableCnt++;
                } catch (UnsupportedOperationException uoe) {
                    //ignore, because animal cannot swim
                }
            }
        }
        return swimmableCnt;
    }


    @Test
    public void testRoosterSecondLanguage() {
        Rooster rooster = new Rooster();
        rooster.sing();
        rooster.sing("Danish");
        rooster.sing("Dutch");
        rooster.sing("Finnish");
        rooster.sing("French");
    }
}

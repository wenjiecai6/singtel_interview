package kingdom;

import kingdom.enums.ParrotType;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testBirdSing(){
        Bird bird = new Bird();
        bird.sing();
    }
    @Test
    public void testParrot(){
        Parrot parrot1 = new Parrot(ParrotType.LIVING_WITH_DOG);
        parrot1.sing();
        Parrot parrot2 = new Parrot(ParrotType.LIVING_WITH_CAT);
        parrot2.sing();
        Parrot parrot3 = new Parrot(ParrotType.LIVING_WITH_ROOSTER);
        parrot3.sing();
    }
}

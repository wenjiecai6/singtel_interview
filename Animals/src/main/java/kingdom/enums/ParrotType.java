package kingdom.enums;

public enum ParrotType {
    LIVING_WITH_DOG("Woof, woof"),LIVING_WITH_CAT("Meow"),LIVING_WITH_ROOSTER("Cock-a-doodle-doo"), ;

    private String sound;

    ParrotType(String sound) {
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }
}

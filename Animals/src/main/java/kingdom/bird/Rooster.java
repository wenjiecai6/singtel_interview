package kingdom.bird;

import kingdom.PropertiesUtils;

public class Rooster extends Bird {
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
    
    public void sing(String language) {
        System.out.println(PropertiesUtils.translate("Cock-a-doodle-doo", language));
    }
}

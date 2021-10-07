package kingdom;

import java.util.Properties;

public class PropertiesUtils {
    private static final Properties prop = new Properties();
    private String language = "English";

    private PropertiesUtils() {

    }

    static {
        prop.setProperty("English.Cock-a-doodle-doo", "Cock-a-doodle-doo");
        prop.setProperty("Danish.Cock-a-doodle-doo", "kykyliky");
        prop.setProperty("Dutch.Cock-a-doodle-doo", "kukeleku");
        prop.setProperty("Finnish.Cock-a-doodle-doo", "kukko kiekuu");
        prop.setProperty("French.Cock-a-doodle-doo", "cocorico");
        prop.setProperty("German.Cock-a-doodle-doo", "kikeriki");
        prop.setProperty("Greek.Cock-a-doodle-doo", "kikiriki");
        prop.setProperty("Hebrew.Cock-a-doodle-doo", "coo-koo-ri-koo");
        prop.setProperty("Hungarian.Cock-a-doodle-doo", "kukuriku");
        prop.setProperty("Italian.Cock-a-doodle-doo", "chicchirichi");
        prop.setProperty("Japanese.Cock-a-doodle-doo", "ko-ke-kok-ko-o");
        prop.setProperty("Portuguese.Cock-a-doodle-doo", "cucurucu");
        prop.setProperty("Russian.Cock-a-doodle-doo", "kukareku");
        prop.setProperty("Swedish.Cock-a-doodle-doo", "kuckeliku");
        prop.setProperty("Turkish.Cock-a-doodle-doo", "kuk-kurri-kuuu");
        prop.setProperty("Urdu.Cock-a-doodle-doo", "kuklooku");
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static String translate(String sound, String language) {
        return prop.getProperty(language + "." + sound, sound);
    }
}

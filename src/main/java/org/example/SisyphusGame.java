import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.configuration.ConfigurationGroup;
import de.gurkenlabs.litiengine.resources.Resources;

public class SisyphusGame {
    public static void main(String[] args) {
        Game.init(args);
        Game.start();
        Game.getScreenManager().addScreen(new GameScreen());
    }
}

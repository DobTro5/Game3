import de.gurkenlabs.litiengine.graphics.RenderComponent;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;

public class MyGameScreen extends GameScreen {
    public MyGameScreen() {
        super("GAME");
    }

    @Override
    protected void initializeComponents() {
        // Инициализация компонентов экрана
        Player player = new Player();
        Boulder boulder = new Boulder();
        Game.world().add(player);
        Game.world().add(boulder);
    }
}

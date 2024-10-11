import de.gurkenlabs.litiengine.graphics.ImageFormat;
import de.gurkenlabs.litiengine.graphics.ImageLoader;

public class TextureManager {
    public void loadTextures() {
        ImageLoader.load("player.png", ImageFormat.PNG);
        ImageLoader.load("boulder.png", ImageFormat.PNG);
        // Загрузка других необходимых текстур
    }
}

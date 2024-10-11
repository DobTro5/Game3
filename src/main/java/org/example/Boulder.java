import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.physics.Collision;

public class Boulder extends Creature {
    public Boulder() {
        super("boulder");
        this.setCollision(true, Collision.STATIC);
    }

    public void rollDown() {
        this.setVelocity(0, 1); // Камень катится вниз
    }
}

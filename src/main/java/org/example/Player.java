import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.input.Input;
import de.gurkenlabs.litiengine.physics.Collision;

import java.util.Timer;
import java.util.TimerTask;

public class Player extends Creature {
    public Player() {
        super("sizif");
        this.setCollision(true, Collision.STATIC);
        this.setVelocity(0, 0);

        Input.mouse().onPressed(event -> this.startMoving());
        Input.mouse().onReleased(event -> this.stopMoving());
    }

    public void startMoving() {
        this.setVelocity(0, -1); // Движение вверх
    }

    public void stopMoving() {
        new Timer().schedule(new TimerTask() {
            @Override public void run() {
                releaseBoulder();
            }
        }, 2000); // Задержка в 2 секунды }

        private void releaseBoulder() {
            // Логика для отпускания камня
        }
    }

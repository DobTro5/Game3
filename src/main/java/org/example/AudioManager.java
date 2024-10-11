import de.gurkenlabs.litiengine.sound.Sound;
import de.gurkenlabs.litiengine.sound.SoundEngine;
import de.gurkenlabs.litiengine.resources.Resources;

public class AudioManager {
    public void playStepSound() {
        Sound stepSound = Resources.sounds().get("step.wav");
        SoundEngine.play(stepSound);
    }

    public void playBoulderSound() {
        Sound boulderSound = Resources.sounds().get("boulder.wav");
        SoundEngine.play(boulderSound);
    }

    // Добавьте другие методы для управления звуками
}

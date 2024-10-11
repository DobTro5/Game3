public class CheckpointManager {
    private Vector2D currentCheckpoint;

    public void reachCheckpoint(Player player) {
        currentCheckpoint = player.getPosition();
        saveProgress();
    }

    public void saveProgress() {
        // Логика для сохранения текущего чекпоинта и рекорда
    }

    public void loadProgress() {
        // Логика для загрузки сохраненного прогресса }
    }

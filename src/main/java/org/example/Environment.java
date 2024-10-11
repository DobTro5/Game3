public class Environment {
    private boolean isSnowing;
    private boolean isRaining;
    private boolean isWindy;

    public void applyWeatherEffects(Player player) {
        if (isSnowing) {
            player.setVelocity(player.getVelocity().multiply(0.8)); // Замедление из-за снега
        }
        if (isRaining) {
            player.setVelocity(player.getVelocity().multiply(0.9)); // Скользкость из-за дождя }
            if (isWindy) {
                player.setVelocity(player.getVelocity().multiply(0.7)); // Замедление из-за ветра
            }
        }
    }

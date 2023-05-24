// The context class defines the interface for the game context.
class GameContext {
    private GameStrategy strategy;

    public void setStrategy(GameStrategy strategy) {
        this.strategy = strategy;
    }

    public void playGame() {
        strategy.play();
    }
}
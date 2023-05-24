import java.util.Scanner;

class ExampleApplication {
    public static void main(String[] args) {
        GameContext context = new GameContext();
        String gameType = readUserInput();

        if (gameType.equals("adventure")) {
            context.setStrategy(new AdventureGameStrategy());
        } else if (gameType.equals("action")) {
            context.setStrategy(new ActionGameStrategy());
        } else if (gameType.equals("puzzle")) {
            context.setStrategy(new PuzzleGameStrategy());
        }

        context.playGame();
    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the game type (adventure, action, puzzle):");
        return scanner.nextLine();
    }
}
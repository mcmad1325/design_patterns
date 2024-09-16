/**
 * Represents the "Easy" difficulty state in the arithmetic game.
 * Implements the State interface to provide functionality specific to the easy level.
 * 
 * @author Madeleine McBride
 */
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;

    /**
     * Constructs an Easy state with a reference to the main arithmetic game.
     * 
     * @param game the instance of the arithmetic game this state belongs to.
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates and returns a random number within the easy difficulty range.
     * 
     * @return a random integer between 1 and 10.
     */
    @Override
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(10);
        number++;
        return number;
    }

    /**
     * Retrieves a random arithmetic operation for the easy difficulty level.
     * 
     * @return a randomly selected arithmetic operation from the Operation enum.
     */
    @Override
    public Operation getOperation() {
        Operation[] operations = Operation.values();
        Random random = new Random();
        int randomIndex = random.nextInt(operations.length);
        return operations[randomIndex];
    }

    /**
     * Increases the difficulty of the game to the medium level.
     * Sets the game's state to medium and notifies the user.
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("Increased Difficulty to the mid-level.");
        game.setState(game.getMediumState());
    }

    /**
     * Decreases the difficulty of the game.
     * Notifies the user that they are not performing well, but does not change the game state.
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("You are not doing well");
    }
}

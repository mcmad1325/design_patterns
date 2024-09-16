/**
 * Represents the "Medium" difficulty state in the arithmetic game.
 * Implements the State interface to provide functionality specific to the medium level.
 * 
 * @author Madeleine McBride
 */
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;

    /**
     * Constructs a Medium state with a reference to the main arithmetic game.
     * 
     * @param game the instance of the arithmetic game this state belongs to.
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates and returns a random number within the medium difficulty range.
     * 
     * @return a random integer between 1 and 50.
     */
    @Override
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(50);
        number++;
        return number;
    }

    /**
     * Retrieves a random arithmetic operation for the medium difficulty level.
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
     * Increases the difficulty of the game to the hard level.
     * Sets the game's state to hard and notifies the user.
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("Increased Difficulty to the advanced-level.");
        game.setState(game.getHardState());
    }

    /**
     * Decreases the difficulty of the game to the easy level.
     * Sets the game's state to easy and notifies the user.
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Yikes, you're not doing well, lets go back to easy");
        game.setState(game.getEasyState());
    }
}

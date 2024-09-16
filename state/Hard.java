/**
 * Represents the "Hard" difficulty state in the arithmetic game.
 * Implements the State interface to provide functionality specific to the hard level.
 * 
 * @author Madeleine McBride
 */
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;

    /**
     * Constructs a Hard state with a reference to the main arithmetic game.
     * 
     * @param game the instance of the arithmetic game this state belongs to.
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates and returns a random number within the hard difficulty range.
     * 
     * @return a random integer between 1 and 100.
     */
    @Override
    public int getNum() {
        Random random = new Random();
        int number = random.nextInt(100);
        number++;
        return number;
    }

    /**
     * Retrieves a random arithmetic operation for the hard difficulty level.
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
     * Increases the difficulty of the game. In the hard state, this method 
     * acknowledges that the player has completed the game, as no higher difficulty 
     * level exists.
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("Great job, you've won the game!");
    }

    /**
     * Decreases the difficulty of the game to the medium level.
     * Sets the game's state to medium and notifies the user.
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Yikes, you're not doing well, lets go back to medium");
        game.setState(game.getMediumState());
    }
}

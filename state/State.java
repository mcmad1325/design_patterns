/**
 * Interface representing the state of the arithmetic game.
 * Each state defines the difficulty level of the game and provides methods
 * for retrieving a number, an operation, and for adjusting the difficulty.
 * 
 * @author Madeleine McBride
 */
public interface State {

    /**
     * Retrieves a number associated with the current state.
     * The number's range and behavior depend on the specific implementation of the state.
     * 
     * @return the number associated with the current state.
     */
    public int getNum();

    /**
     * Retrieves the arithmetic operation associated with the current state.
     * The operation could be addition, subtraction, multiplication, etc., 
     * depending on the specific implementation of the state.
     * 
     * @return the operation associated with the current state.
     */
    public Operation getOperation();

    /**
     * Increases the difficulty level of the game.
     * The exact effect of increasing difficulty depends on the specific implementation of the state.
     */
    public void increaseDifficulty();

    /**
     * Decreases the difficulty level of the game.
     * The exact effect of decreasing difficulty depends on the specific implementation of the state.
     */
    public void decreaseDifficulty();
}

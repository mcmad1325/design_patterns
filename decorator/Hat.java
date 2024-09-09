package decorator;

/**
 * Represents a decoration that adds a hat to a character.
 * This class extends the {@link Character} class to apply a hat decoration.
 * 
 * <p>
 * The {@code Hat} class utilizes composition to decorate a {@code Character} object with a hat. 
 * It inherits the character's properties and modifies its description to include a hat.
 * </p>
 */
public class Hat extends Character {

    /**
     * Constructs a new {@code Hat} decorator for the given character.
     * This constructor initializes the {@code Hat} with the specified character's name
     * and utilizes the existing lines from the {@code Character} class.
     *
     * @param character The character to be decorated with a hat.
     */
    public Hat(Character character) {
        super(character.lines, character.getName());
    }
}

package decorator;

/**
 * Represents a decoration that adds eyes to a character.
 * This class extends the {@link Character} class to apply an eyes decoration.
 * 
 * <p>
 * The {@code Eyes} class decorates a {@code Character} object by adding eyes
 * to its description. It inherits the character's properties and modifies its
 * description to include eyes.
 * </p>
 */
public class Eyes extends Character {

    /**
     * Constructs a new {@code Eyes} decorator for the given character.
     * This constructor initializes the {@code Eyes} with the specified character's
     * name and utilizes the existing lines from the {@code Character} class.
     *
     * @param character The character to be decorated with eyes.
     */
    public Eyes(Character character) {
        super(character.lines, character.getName());
    }
}

package decorator;

/**
 * Represents a decoration that adds ears to a character.
 * This class extends the {@link Character} class to apply an ears decoration.
 * 
 * <p>
 * The {@code Ears} class decorates a {@code Character} object by adding ears
 * to its description. It inherits the character's properties and modifies its
 * description to include ears.
 * </p>
 */
public class Ears extends Character {

    /**
     * Constructs a new {@code Ears} decorator for the given character.
     * This constructor initializes the {@code Ears} with the specified character's
     * name and utilizes the existing lines from the {@code Character} class.
     *
     * @param character The character to be decorated with ears.
     */
    public Ears(Character character) {
        super(character.lines, character.getName());
    }
}

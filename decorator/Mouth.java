package decorator;

/**
 * Represents a decoration that adds a mouth to a character.
 * This class extends the {@link Character} class to apply a mouth decoration.
 * 
 * <p>
 * The {@code Mouth} class decorates a {@code Character} object by adding a mouth
 * to its description. It inherits the character's properties and modifies its
 * description to include a mouth.
 * </p>
 */
public class Mouth extends Character {

    /**
     * Constructs a new {@code Mouth} decorator for the given character.
     * This constructor initializes the {@code Mouth} with the specified character's
     * name and utilizes the existing lines from the {@code Character} class.
     *
     * @param character The character to be decorated with a mouth.
     */
    public Mouth(Character character) {
        super(character.lines, character.getName());
    }

}

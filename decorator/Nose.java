package decorator;

/**
 * Represents a decoration that adds a nose to a character.
 * This class extends the {@link Character} class to apply a nose decoration.
 * 
 * <p>
 * The {@code Nose} class decorates a {@code Character} object by adding a nose
 * to its description. It inherits the character's properties and can modify its
 * description to include a nose.
 * </p>
 */
public class Nose extends Character {

    /**
     * Constructs a new {@code Nose} decorator for the given character.
     * This constructor initializes the {@code Nose} with the specified character's
     * name and utilizes the existing lines from the {@code Character} class.
     *
     * @param character The character to be decorated with a nose.
     */
    public Nose(Character character) {
        super(character.lines, character.getName());
    }
}

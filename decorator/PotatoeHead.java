package decorator;

import java.util.ArrayList;

/**
 * Represents a specific type of character, named "Potatoe Head".
 * This class extends the {@link Character} class to provide a base implementation
 * with a specific name for the character.
 * 
 * <p>
 * The {@code PotatoeHead} class allows for the creation of a character with the 
 * name "Potatoe Head" and uses the {@code Character} class to manage description 
 * lines and other properties.
 * </p>
 */
public class PotatoeHead extends Character {

    /**
     * Constructs a new {@code PotatoeHead} with the specified name.
     * This constructor initializes the {@code PotatoeHead} with the given name and
     * uses the lines from the base {@code Character} class.
     *
     * @param name The name of the Potatoe Head character.
     */
    public PotatoeHead(String name) {
        super(lines, name); // Initialize with an empty list and the provided name
    }
}

package decorator;

import java.util.ArrayList;

/**
 * A decorator class that extends {@link Character} to add additional decorations to a character.
 * 
 * <p>
 * The {@code CharacterDecorator} class allows for the addition of custom decorations to a character's description.
 * It uses composition to incorporate a base {@code Character} object and can integrate additional
 * decorative elements into the character's description.
 * </p>
 */
public class CharacterDecorator extends Character {
    /**
     * The base character that is being decorated.
     */
    private Character character;

    /**
     * Constructs a new {@code CharacterDecorator} for the given character.
     * This constructor initializes the decorator with the specified character and
     * passes the character's lines and name to the base {@code Character} class.
     *
     * @param character The character to be decorated.
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName()); // Passes the lines and name to the base constructor
        this.character = character;
    }

    /**
     * Integrates new decorations into the character's description.
     * This method combines the existing description of the base character with new decorations.
     *
     * @param decor An ArrayList of strings representing new decorations to be added to the character's description.
     */
    public void integrateDecor(ArrayList<String> decor) {
        // Create a new description by combining existing description with new decorations
        StringBuilder newDescription = new StringBuilder(character.toString());

        // Append each decoration from the list
        for (String decoration : decor) {
            newDescription.append("\n").append(decoration);
        }

        // Update the lines to reflect the new description
        lines.clear();  // Clear existing lines before adding new ones
        lines.add(newDescription.toString());
    }

    /**
     * Returns a string representation of the decorated character.
     * This method returns the base character's string representation, reflecting any applied decorations.
     * 
     * @return A string describing the character with all current decorations.
     */
    @Override
    public String toString() {
        return character.toString(); // Return the base character's string representation
    }
}

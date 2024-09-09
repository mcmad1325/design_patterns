package decorator;

import java.util.ArrayList;

/**
 * Abstract class representing a basic character.
 * This class holds the character's name and a list of description lines.
 * It provides a method to generate a string representation of the character,
 * including details from a file and additional description lines.
 */
public abstract class Character {
    /**
     * The name of the character.
     */
    protected String name;

    /**
     * A list of description lines for the character.
     */
    protected static ArrayList<String> lines;

    /**
     * Constructs a new Character with the specified name and description lines.
     *
     * @param lines An ArrayList of strings representing description lines for the character.
     * @param name The name of the character.
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * Returns the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the character, including the name,
     * a description from a file, and any additional description lines.
     * The file content is retrieved using the FileReader.getLines method.
     *
     * @return A string describing the character.
     */
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Name: ").append(name).append("\n");
        description.append("Potato Head Description:\n");

        // Add content from the file (assuming FileReader is a utility class you have)
        description.append(FileReader.getLines("ears.txt")).append("\n");

        // Append any additional lines (commented out, can be used if needed)
        /*
        for (String line : lines) {
            description.append(line).append("\n");
        }
        */

        return description.toString();
    }
}

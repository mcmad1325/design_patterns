/**
 * @author Madeleine McBride
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Represents an arithmetic game with varying difficulty levels.
 * The game maintains different states for easy, medium, and hard levels, 
 * and allows for generating questions and managing scores.
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Constructs an ArithemeticGame instance, initializing the states for 
     * easy, medium, and hard difficulties. The initial state is set to easy, 
     * and the score is initialized to 0.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        this.score = 0;
        Scanner keyboard;
    }

    /**
     * Generates a new question based on the current game state.
     * The difficulty of the numbers used in the question depends on the current state.
     *
     * @return a new Question object with randomly generated numbers and an operation.
     */
    public Question getQuestion() {
        Random random = new Random();
        int num1 = 0, num2 = 0;

        // Adjust number ranges based on the current state
        if (state == easyState) {
            num1 = random.nextInt(10) + 1; // Numbers between 1 and 10 for easy
            num2 = random.nextInt(10) + 1;
        } else if (state == mediumState) {
            num1 = random.nextInt(50) + 1; // Numbers between 1 and 50 for medium
            num2 = random.nextInt(50) + 1;
        } else if (state == hardState) {
            num1 = random.nextInt(100) + 1; // Numbers between 1 and 100 for hard
            num2 = random.nextInt(100) + 1;
        }

        // Randomly select an operation
        Operation operation = state.getOperation();

        // Create and return a new Question object
        return new Question(num1, num2, operation);
    }

    /**
     * Increases the player's score by 1 and prints the updated score.
     */
    public void increaseScore() {
        score++;
        System.out.println("Score increased! Current score: " + score);
    }

    /**
     * Decreases the player's score by 1 and prints the updated score.
     */
    public void decreaseScore() {
        score--;
        System.out.println("Score decreased! Current score: " + score);
    }

    /**
     * Sets the current state of the game.
     *
     * @param state the new state to set.
     */
    public void setState(State state) {
        this.state = state;
        System.out.println("Game state changed.");
    }

    /**
     * Returns the easy state of the game.
     *
     * @return the easy state.
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Returns the medium state of the game.
     *
     * @return the medium state.
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Returns the hard state of the game.
     *
     * @return the hard state.
     */
    public State getHardState() {
        return hardState;
    }
}


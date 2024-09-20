/**
 * @author Madeleine McBride
 */

 import java.util.Random;
import java.util.ArrayList;

/**
 * Represents the trivia game logic, managing questions and player scores.
 */
public class TriviaGame {

    // Create instance variables
    private static TriviaGame triviaGame; // Singleton instance
    private int score; // Player's score
    private Random rand; // Random number generator
    private ArrayList<Question> questions; // List of trivia questions

    /**
     * Private constructor for the TriviaGame class. Initializes the game state.
     */
    private TriviaGame() {
        questions = DataLoader.getTriviaQuestions(); // Load questions from the data source
        rand = new Random(); // Initialize random number generator
    }

    /**
     * Provides access to the singleton instance of TriviaGame.
     *
     * @return The singleton instance of TriviaGame.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame(); // Create instance if not already created
        }
        return triviaGame;
    }

    /**
     * Retrieves a random question from the list of available questions.
     *
     * @return A randomly selected Question, or null if no questions are left.
     */
    public Question getQuestion() {
        if (questions.isEmpty()) {
            return null; // No questions left
        }
        int index = rand.nextInt(questions.size()); // Get a random index
        return questions.get(index); // Return the question at that index
    }

    /**
     * Checks if there are more questions available to play.
     *
     * @return True if there are questions left, otherwise false.
     */
    public boolean hasMoreQuestions() {
        return !questions.isEmpty(); // Returns true if questions list is not empty
    }

    /**
     * Increases the player's score by one for winning a round.
     */
    public void winRound() {
        score++; // Increment score
    }

    /**
     * Decreases the player's score by one for losing a round.
     */
    public void loseRound() {
        score--; // Decrement score
    }

    /**
     * Retrieves the current score of the player.
     *
     * @return A string message indicating the current score.
     */
    public String getScores() {
        return "Great! Your score is: " + score; // Return current score message
    }
}

/**
 * @author Madeleine McBride
 */

import java.util.ArrayList;

/**
 * Represents a trivia question with multiple choice answers.
 */
public class Question {
    private String question; // The trivia question prompt
    private ArrayList<String> answers; // List of possible answers
    private int correctAnswer; // Index of the correct answer (0-3)

    /**
     * Constructs a Question instance with the specified prompt and answers.
     *
     * @param question The trivia question prompt.
     * @param correctAnswer The index of the correct answer (0-based).
     * @param answers A variable number of answer options. Must contain exactly 4 answers.
     * @throws IllegalArgumentException if the number of answers is not exactly 4.
     */
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question; // Set the question prompt
        this.correctAnswer = correctAnswer; // This should match the zero-based index
        this.answers = new ArrayList<>();

        // Add answers to the ArrayList
        for (String answer : answers) {
            this.answers.add(answer);
        }

        // Check if we have exactly 4 answers
        if (this.answers.size() != 4) {
            throw new IllegalArgumentException("There must be exactly 4 answers provided.");
        }
    }

    /**
     * Returns a string representation of the question and its answers.
     *
     * @return A formatted string displaying the question and answer options.
     */
    @Override
    public String toString() {
        return question + "\n 1. " + answers.get(0) + "\n 2. " + answers.get(1) +
               "\n 3. " + answers.get(2) + "\n 4. " + answers.get(3) + "\n";
    }

    /**
     * Checks if the given answer index corresponds to the correct answer.
     *
     * @param userAnswer The user's answer index (1-based).
     * @return True if the answer is correct, otherwise false.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswer; // Compare with zero-based index
    }

    /**
     * Retrieves the correct answer for this question.
     *
     * @return The correct answer as a string.
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer); // Returns the correct answer based on zero-based index
    }
}

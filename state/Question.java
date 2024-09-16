/**
 * Represents a mathematical question in the arithmetic game.
 * The question is generated based on two numbers and an operation.
 * The class also provides methods to retrieve the correct answer and check if a given answer is correct.
 * 
 * @author Madeleine McBride
 */
public class Question {
    private String question;
    private int answer;

    /**
     * Constructs a Question object based on two numbers and an arithmetic operation.
     * The question string and the correct answer are calculated based on the provided operation.
     * 
     * @param num1 the first number for the question.
     * @param num2 the second number for the question.
     * @param operation the arithmetic operation to be used in the question (e.g., PLUS, MINUS, MULTIPLY, DIVIDE).
     */
    public Question(int num1, int num2, Operation operation) {
        switch (operation) {
            case PLUS:
                question = num1 + " + " + num2;
                answer = num1 + num2;
                break;
            case MINUS:
                question = num1 + " - " + num2;
                answer = num1 - num2;
                break;
            case MULTIPLY:
                question = num1 + " * " + num2;
                answer = num1 * num2;
                break;
            case DIVIDE:
                // Check if division by zero is attempted
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                question = num1 + " / " + num2;
                answer = num1 / num2;
                break;
        }
    }

    /**
     * Returns the question as a string with a placeholder for the answer.
     * 
     * @return the question string in the format "num1 operation num2 = ?".
     */
    @Override
    public String toString() {
        return question + " = ?";
    }

    /**
     * Retrieves the correct answer for the question.
     * 
     * @return the correct answer as an integer.
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Checks if a given answer is correct for the question.
     * 
     * @param answer the answer to be checked.
     * @return true if the given answer matches the correct answer, false otherwise.
     */
    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }
}

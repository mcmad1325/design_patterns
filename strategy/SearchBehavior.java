/**
 * @author Madeleine McBride
 * The SearchBehavior interface provides a method that searches for a Person object in a list of Person objects.
 */

//Import packages
package strategy;
import java.util.List;

public interface SearchBehavior {
    /**
     * This method searches for a person in a list of people.
     * @param people The list of people
     * @param person The person to search for
     * @return True if the person is in the list, false otherwise
     */
   public default boolean contains(List<Person> people, Person person) {
    for (Person p : people) {
        if (p.equals(person)) {
            return true;
        }
    }
    return false;
}
}

/**
 * @author Madeleine McBride
 * LinearSearch implements the SearchBehavior interface and provides the contains method that searches for a Person object in a list of Person objects using the linear search algorithm.
 */

 //Import Packages
package strategy;
import java.util.List;

public class LinearSearch implements SearchBehavior {
    /**
     * This method searches for a person in a list of people using the linear search algorithm.
     */
    public boolean contains(List<Person> persons, Person item)
    {
        if(persons == null)
            return false;
        for (int i = 0; i < persons.size(); i++)
        {
            if(persons.get(i).equals(item))
            {
                return true;
            }
        }
        return false;
    }
}

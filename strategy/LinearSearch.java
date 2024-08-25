package strategy;

import java.util.List;

public class LinearSearch implements SearchBehavior {
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

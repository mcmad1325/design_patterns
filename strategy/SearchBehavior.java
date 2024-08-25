package strategy;

import java.util.List;

public interface SearchBehavior {
   public default boolean contains(List<Person> people, Person person) {
    for (Person p : people) {
        if (p.equals(person)) {
            return true;
        }
    }
    return false;
}
}

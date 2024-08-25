/**
 * @author Madeleine McBride
 * Attendees class is a class that represents a list of people who are attending an event (the birthday party).
 */


 //Import Packages
package strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attendees{
    //Create instance variables
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;


    /**
     * Creates a new Attendees object
     * @param title The title of the event
     */
    public Attendees(String title) {
        this.title = title;
        init();
        people = new ArrayList<Person>();
    }

    /**
     * Adds a person to the list of people attending the event
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param reminder
     * @return
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
    
        if (!searchBehavior.contains(people, person)) {
            people.add(person);
        }
        return person;
    }


    /**
     * Gets the Title of the event
     * @return
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * set the behavior of the search used (linear or binary)
     * @param searchBehavior
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Gets the list of people attending the event
     * @return
     */
    public List<Person> getList() {
        List<Person> sortedList = new ArrayList<>(people);
        Collections.sort(sortedList);
        return sortedList;
    }

    /** 
     * Initializes the search behavior to linear search
     */
    public void init(){
        LinearSearch linearSearch = new LinearSearch();
        setSearchBehavior(linearSearch);
    }
}

package strategy;

import java.util.ArrayList;
import java.util.List;

public class Attendees{
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        init();
        people = new ArrayList<>();
    }

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if(people.contains(person)){
            //System.out.println("Already on list:" + person.getFirstName() + " " + person.getLastName());
            people.remove(person);
        }
        else{
            people.add(person);
        }
        return person;
    }

    public String getTitle() {
        return title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    public List<Person> getList() {
        return people;
    }

    public void init(){
        LinearSearch linearSearch = new LinearSearch();
        setSearchBehavior(linearSearch);
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FanReads implements Observer{

    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);
        this.recommendations = new HashMap<Genre, ArrayList<Book>>();
    }

    public void update(Book book) {
        if(recommendations.containsKey(book.getGenre())) {
            recommendations.get(book.getGenre()).add(book);
        } else {
            ArrayList<Book> books = new ArrayList<Book>();
            books.add(book);
            recommendations.put(book.getGenre(), books);
        }
    }

    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);
    }
}

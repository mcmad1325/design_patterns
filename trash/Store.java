package observer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        this.bestSellers = new LinkedList<Book>();
    }

    public void update(Book book) {
        if(bestSellers.size() >= 5) {
            bestSellers.remove(book);
        } else {
            bestSellers.add(book);
        }
    }

    public List<Book> getBestSellers() {
        return new LinkedList<Book>(bestSellers);
    }
}
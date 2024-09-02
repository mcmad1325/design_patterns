import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }

    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        if(bestSellers.size() >= 5) {
            bestSellers.remove(0);
        }
        bestSellers.add(book);
        notifyObservers(book);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyObservers'");
    }
}

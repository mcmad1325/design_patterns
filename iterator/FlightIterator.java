/**
 * @author Madeleine McBride 
 */
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The FlightIterator class implements the Iterator interface to iterate
 * over a collection of Flight objects. It filters flights based on
 * specific departure and destination airports.
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator with the specified list of flights,
     * departure airport, and destination airport.
     *
     * @param flights the list of flights to iterate over
     * @param from    the departure airport
     * @param to      the destination airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    /**
     * Checks if there is a next flight that matches the specified
     * departure and destination airports.
     *
     * @return true if there is a next matching flight; false otherwise
     */
    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
                return true; // Found a matching flight
            }
            position++;
        }
        return false; // No more matching flights
    }

    /**
     * Returns the next flight that matches the specified departure and
     * destination airports.
     *
     * @return the next matching Flight
     * @throws java.util.NoSuchElementException if no more matching flights are available
     */
    @Override
    public Flight next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more flights available.");
        }
        return flights.get(position++);
    }
}

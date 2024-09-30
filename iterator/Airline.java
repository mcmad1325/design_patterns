/**
 * @author Madeleine McBride
 */
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * The Airline class represents an airline, holding a collection of flights
 * and providing functionality to create an iterator for those flights based
 * on specified departure and destination airports.
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs an Airline with the specified title and initializes it
     * with a default flight.
     *
     * @param title the name of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = new ArrayList<Flight>();
        flights.add(new Flight("AA123", Airport.BOS, Airport.ATL, LocalTime.of(8, 14), LocalTime.of(10, 30), 1));
    }

    /**
     * Retrieves the title of the airline.
     *
     * @return the title of the airline
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates a FlightIterator for the flights that match the specified
     * departure and destination airport codes.
     *
     * @param fromCode the airport code for the departure airport
     * @param toCode   the airport code for the destination airport
     * @return a FlightIterator for the matching flights
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        Airport from = Airport.valueOf(fromCode);
        Airport to = Airport.valueOf(toCode);
        return new FlightIterator(flights, from, to);
    }
}

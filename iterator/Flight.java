/**
 * @author Madeleine McBride
 */
import java.time.LocalTime;

/**
 * The Flight class represents a flight with its details, including flight
 * number, departure and arrival airports, departure and arrival times,
 * and the number of transfers.
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight with the specified details.
     *
     * @param flightNum    the flight number
     * @param from         the departure airport
     * @param to           the destination airport
     * @param startTime    the departure time
     * @param endTime      the arrival time
     * @param numTransfers  the number of transfers for the flight
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Retrieves the departure airport of the flight.
     *
     * @return the departure Airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Retrieves the destination airport of the flight.
     *
     * @return the destination Airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight has the same departure and destination
     * airports as the specified airports.
     *
     * @param from the departure airport to compare
     * @param to   the destination airport to compare
     * @return true if both airports match; false otherwise
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from.equals(from) && this.to.equals(to);
    }

    /**
     * Returns a string representation of the flight details.
     *
     * @return a string describing the flight
     */
    @Override
    public String toString() {
        return flightNum + " from " + from + " to " + to + 
               " departs at " + startTime + 
               " and arrives at " + endTime + 
               " with " + numTransfers + " transfers";
    }
}

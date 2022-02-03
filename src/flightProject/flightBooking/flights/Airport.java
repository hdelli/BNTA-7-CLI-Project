package flightProject.flightBooking.flights;

import java.util.Arrays;
import java.util.Objects;

public class Airport {
    private Flight[] flights;
    private String name;
    private long airportId;
    private int capacity;

    public Airport(String name, long airportId, int capacity) {
        this.name = name;
        this.airportId = airportId;
        this.capacity = capacity;
        this.flights = new Flight[capacity];
    }

    public Airport() {
    }

//    public Airport( int capacity, String name, long airportId) {
//        this.flights = new Flight[capacity];
//        this.name = name;
//        this.airportId = airportId;
//        this.capacity=capacity;
//    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAirportId() {
        return airportId;
    }

    public void setAirportId(long airportId) {
        this.airportId = airportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return airportId == airport.airportId && capacity == airport.capacity && Arrays.equals(flights, airport.flights) && Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, airportId, capacity);
        result = 31 * result + Arrays.hashCode(flights);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "flights=" + Arrays.toString(flights) +
                ", name='" + name + '\'' +
                ", airportId=" + airportId +
                ", capacity=" + capacity +
                '}';
    }
}


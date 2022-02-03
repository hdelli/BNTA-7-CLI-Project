package flightProject.flightBooking.flights;

import flightProject.flightBooking.passengers.Passenger;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private long flightNumber;
    private int capacity;
    private Passenger[] passengers;
    private Destination destination;

    public Flight() {
    }

    public Flight(long flightNumber, int capacity, Destination company) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
        this.destination = company;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", capacity=" + capacity +
                ", passengers=" + Arrays.toString(passengers) +
                ", destination=" + destination +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && capacity == flight.capacity && Arrays.equals(passengers, flight.passengers) && destination == flight.destination;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flightNumber, capacity, destination);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }
}

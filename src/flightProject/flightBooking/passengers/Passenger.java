package flightProject.flightBooking.passengers;
import flightProject.flightBooking.flights.Flight;

import java.util.Arrays;
import java.util.Objects;

public class Passenger {

    private String firstName;
    private String nationality;
    private String email;
    private long passengerId;


    public Passenger() {
    }

    public Passenger(String firstName, String nationality, String email, long passengerId) {
        this.firstName = firstName;
        this.nationality = nationality;
        this.email = email;
        this.passengerId = passengerId;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return passengerId == passenger.passengerId && Objects.equals(firstName, passenger.firstName) && Objects.equals(nationality, passenger.nationality) && Objects.equals(email, passenger.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, nationality, email, passengerId);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", email='" + email + '\'' +
                ", passengerId=" + passengerId +
                '}';
    }
}


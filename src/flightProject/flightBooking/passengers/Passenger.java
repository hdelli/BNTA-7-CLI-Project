package flightProject.flightBooking.passengers;
import java.util.Objects;

public class Passenger {

    private String firstName;
    private String lastName;
    private String nationality;
    private String email;
    private String address;
    private long passengerId;

    public Passenger(String firstName, String lastName, String nationality, String email, String address, long passengerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.email = email;
        this.address = address;
        this.passengerId = passengerId;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String phoneNumber) {
        this.nationality = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", passengerId=" + passengerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return passengerId == passenger.passengerId && Objects.equals(firstName, passenger.firstName) && Objects.equals(lastName, passenger.lastName) && Objects.equals(nationality, passenger.nationality) && Objects.equals(email, passenger.email) && Objects.equals(address, passenger.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, nationality, email, address, passengerId);
    }
}


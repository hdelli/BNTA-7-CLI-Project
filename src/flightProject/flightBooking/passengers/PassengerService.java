package flightProject.flightBooking.passengers;

import flightProject.flightBooking.flights.Flight;
import flightProject.flightBooking.flights.FlightDAO;

public class PassengerService { //Change this to Flight service
    private PassengerDAO passengerDAO;
    //Add passenger from a flight
    //remove passenger from a flight

    public PassengerService(PassengerDAO passengerDAO) {
        this.passengerDAO = passengerDAO;
    }

    public int getCurrentPassengersInFlightCount(Flight flight) {
        int currentPassengersInFlightCount = 0;
        for (Passenger p : flight.getPassengers()) {
            if (p != null) {
                currentPassengersInFlightCount++;
            }
        }

        return currentPassengersInFlightCount;

    }

    public void addPassenger(Flight flight, Passenger passenger) {
        int currentPassengerInFlight = getCurrentPassengersInFlightCount(flight);
        if (currentPassengerInFlight < flight.getCapacity()) {
           passengerDAO.addPassenger(passenger);
            //add passenger to the flight
            for (int i = 0; i < flight.getPassengers().length; i++) {
                if(flight.getPassengers()[i] == null){
                    flight.getPassengers()[i]=passenger;
                }
            }

        }

    }
    public void removePassenger(Flight flight, Passenger passenger){
        for (int i = 0; i < flight.getPassengers().length; i++) {
            if(flight.getPassengers()[i]==passenger){
                flight.getPassengers()[i]=null;
            }
        }
    }

    //3.Display flight for a specific user
    public Flight[] displayPassengersFlight(Passenger passenger){
        return passenger.getFlight();
    }


}

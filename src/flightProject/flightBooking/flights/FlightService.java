package flightProject.flightBooking.flights;

import flightProject.flightBooking.passengers.Passenger;

public class FlightService { // change this to Passenger Service
    private FlightDAO flightDAO;

    //Create methods that:
    //Add flight
    //Remove flight
    //Display all flights


    public FlightService(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }


    public int getCurrentFlightsInAirportCount(Airport airport) {
        int currentFlightInAirportCount = 0;
        for (Flight f : airport.getFlights()) {
            if (f != null) {
                currentFlightInAirportCount++;
            } else {
                continue;
            }
        }
        return currentFlightInAirportCount;
    }

    public void addFlight(Flight flight, Airport airport) {
        int currentFlightInAirport = getCurrentFlightsInAirportCount(airport);
        if (currentFlightInAirport < airport.getCapacity()) {
            for (int i = 0; i < airport.getFlights().length; i++) {
                if (airport.getFlights()[i] == null) {
                    airport.getFlights()[i] = flight;
                    break;
                }

            }
        }
    }
}

//        }else {
//            throw new IllegalStateException("airport full");
//        }
//            for (Flight airportFlight : airport.getFlights()){
//                if(airportFlight==null){
//                    airportFlight=flight;
//                }
//            }
//        }else{
//            throw new IllegalStateException(airport.getName()+ " "+ "is full");
//        }
//    }
//
//
//
//}

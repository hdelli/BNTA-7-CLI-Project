package flightProject.flightBooking.flights;

public class FlightDAO {// METHOD THAT RETURNS A LIST OF FLIGHTS AND DATABASE THAT STORES THE LIST OF FLIGHTS

    Flight flight1 = new Flight(2, 3, Destination.Albania);
    Flight flight2 = new Flight(3, 3, Destination.Bulgaria);
    Flight flight3 = new Flight(4, 3, Destination.Canada);
    Flight flight4 = new Flight(5, 3, Destination.Denmark);
    Flight flight5 = new Flight(6, 3, Destination.Egypt);
    Flight flight6 = new Flight(7, 3, Destination.France);
    Flight flight7 = new Flight(8, 3, Destination.Georgia);

}

//    private Flight[] flights;
//
//
//    public FlightDAO() {
//        this.flights = new Flight[10];
//    }
//
//    public Flight[] getFlights() {
//        return flights;
//    }
//
//    public void addFlight(Flight flight){
//        for (int i = 0; i < flights.length; i++) {
//            if(flights[i]==null){
//                flights[i]=flight;
//            }
//        }
//    }
//
//    String[] listOfCompanies = {"British Airways", "Ryanair", "Turkish Airlines", "Emirates", "AirFrance"};
//
//
//
//
//
////    public void addFlights(Flight flight, Flight[] flights){
////        for (int i = 0; i < flights.length; i++) {
////            if(flights[i]==null){
////                flights[i]=flight;
////            }
////
////        }
////    }
////
////    public void deleteFlight(Flight flight, Flight[] flights){
////        for (int i = 0; i < flights.length; i++) {
////            if (flights[i] == flight) {
////                flights[i] = null;
////
////            }
////        }
////
////    }






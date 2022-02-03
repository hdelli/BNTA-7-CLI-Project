package flightProject.flightBooking.passengers;

import flightProject.flightBooking.flights.Flight;

public class PassengerDAO {
    // write a method that allows you to delete passenger

    Passenger nayan = new Passenger("Nayan", "Nepalese", "nayan@yahoo.fr", 1223 );
    Passenger adib = new Passenger("Adib", "Bengali", "adib@gmail.com", 2344);
    Passenger hajr = new Passenger("Hajr", "Algeria", "hajr@hotmail.com", 1234);
    Passenger wendy = new Passenger("Wendy","Ghanaian", "wendy@yahoo.co.uk", 1111);
}



//     1. add passenger - using all details
//     2. delete passenger - for management interface only - private
//     3. say system full when it is - flight side or passenger?
//private Passenger[] passengers;

//public PassengerDAO(int capacity) {
//  this.passengers = new Passenger[capacity];
// }

// write a method that allows you to add a passenger (user will be able to do this)

// public void addPassenger(Passenger passenger) {
//  for (int i = 0; i < passengers.length; i++) {
//    if(passengers[i]==passenger){
//        passengers[i]=passenger;
// }
// }

// }
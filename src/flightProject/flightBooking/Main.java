package flightProject.flightBooking;

import flightProject.flightBooking.flights.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Airport heathrow = new Airport("Heathrow",1,20);
        Airport gatwick= new Airport("Gatwick",2,30);


        Scanner scanner = new Scanner(System.in);
        FlightService flightservice = new FlightService(new FlightDAO());
        System.out.println("Welcome to CLI flight booking.com");
        System.out.println("Option1: -> (1) Add flight, (2) remove flight (Select 1 or 2) ");
        int input= scanner.nextInt();
        if(input==1){
            System.out.println("Please enter full name:");
            String name= scanner.nextLine();

            System.out.println("Please enter email:");
            String email= scanner.nextLine();



            Flight flight= new Flight();
            System.out.println("Please enter flight number:");
            long s= scanner.nextLong();
            flight.setFlightNumber(s);
            System.out.println("Please enter capacity");
            int capacity=scanner.nextInt();
            flight.setCapacity(capacity);
            //try1
            flight.setCompany(Destination.BRITISH_AIRWAYS);
            flight.setDestinationAirport(gatwick);
            flight.setFull(false);
            System.out.println("Please enter company ");
            String s3 = scanner.nextLine();
            boolean comeBack = false;
            while (comeBack= false) {
                Destination company1 = Enum.valueOf(Destination);
                company1.f
                }
                    Destination company1 = Destination.getByName(scanner.nextLine());
                    // Destination company1 = Destination.valueOf(scanner.nextLine().toUpperCase());
                    flight.setCompany(company1);
                    break;
                }
                catch (Exception e) {
                    System.out.println("Destination doesn't exist, please enter valid company: ");
                }
        }


        System.out.println("From which airport?");
        System.out.println("Option1: Heathrow or Option2: Gatwick");
        int airportChosen=scanner.nextInt();
        if(airportChosen==1) {
            flight.setSourceAirport(heathrow);
            FlightService flightService = new FlightService(new FlightDAO());
            flightService.addFlight(flight, heathrow);
            System.out.println("flight added");
            System.out.println(heathrow);
        }
        if(airportChosen==2) {
            flight.setSourceAirport(gatwick);
            FlightService flightService = new FlightService(new FlightDAO());
            flightService.addFlight(flight, gatwick);
            System.out.println("flight added");
        }

            }
        }



        if (sc == 2) {
            System.out.println("Option 2: -> (1) Add Passenger, (2) Remove Passenger");
        }



    }
}

package flightProject.flightBooking.flights;

public enum Destination {
    Albania,
    Bulgaria,
    Canada,
    Denmark,
    Egypt,
    France,
    Georgia;


    public static Destination getByName(String name) {
        try {
            return valueOf(name.toLowerCase());

        } catch (IllegalArgumentException e) {
            System.out.println("returning null");
            return null;
        }

    }
}

import java.util.Scanner;

public class MainPlane {
    public static void main(String[] args) {
        Passenger passenger = null;
        Airline plane = new Airline();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to input details. \n" +
                "Enter 2 to book flight. \n" +
                "Enter 3 to generate boarding pass. \n" +
                "Enter 4 to quit");

        int number = scanner.nextInt();
        while (number != 4) {
            switch (number) {
                case 1:
                    System.out.println("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.next();
                    passenger = new Passenger(firstName, lastName);
                    break;

                case 2:
                    System.out.println("What flight section would you prefer ?");
                    FlightSection flightSection = null;
                    String flightClass = scanner.next();
                    flightClass = flightClass.toLowerCase();

                    switch (flightClass) {
                        case "firstclass":
                            flightSection = FlightSection.FIRSTCLASS;
                            break;

                        case "economy":
                            flightSection = FlightSection.ECONOMY;
                            break;

                        default:
                    }
                    System.out.println("Please, enter departure city");
                    String departureCity = scanner.next();

                    System.out.println("Please, enter arrival city");
                    String arrivalCity = scanner.next();

                    System.out.println("Please, enter departure date");
                    String departureDate = scanner.next();

                    System.out.println("Please, enter arrival date");
                    String arrivalDate = scanner.next();

                    System.out.println("Please, enter departure time");
                    String departureTime = scanner.next();

                    plane.setBoardingPassForPlane(departureCity, arrivalCity, departureDate, departureTime, arrivalDate);
                    plane.bookSeatsOnPlane(flightSection, passenger);

                case 3:
                    System.out.println(plane.getBoardingPass());
                default:

            }
            System.out.println("Enter 1 to input details. \n" +
                    "Enter 2 to book flight. \n" +
                    "Enter 3 to generate boarding pass. \n" +
                    "Enter 4 to quit");
            number = scanner.nextInt();
        }
        System.out.println("Exiting!!");
    }
}

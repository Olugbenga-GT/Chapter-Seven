/*
(Airline Reservations System) A small airline has just purchased a computer for its new automated
reservations system. You’ve been asked to develop the new system. You’re to write an application
to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the firstclass
section (seats 1–5). If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
* */


import java.util.InputMismatchException;

public class Airline {

    private int economyClassMonitor;
    private boolean[] seats;
    private String boardingPass;
    private BoardingPass boardingPassForPlane;
    private int firstClassMonitor;

    public Airline() {
        seats = new boolean[10];
        boardingPassForPlane = new BoardingPass("Lagos","Onitsha","13/04/2021",
                                                "14/04/2021","3.00 P.M");
    }

    public void setBoardingPassForPlane(String departureCity, String arrivalCity, String departureDate, String arrivalDate, String departureTime ){
         boardingPassForPlane = new BoardingPass(departureCity, arrivalCity, departureDate, arrivalDate, departureTime);
    }

    public boolean[] getSeats() {
        try {
            return seats;
        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Invalid seat number");
        }
        return  null;
    }

    public void bookSeatsOnPlane(FlightSection flightSection, Passenger passenger) {
        try{switch(flightSection){
            case FIRSTCLASS -> bookSeatsOnFirstClassSection(passenger);
            case ECONOMY ->  bookSeatOnEconomySection(passenger);
        }} catch (InputMismatchException error){
            System.err.println("Invalid input");
        }
    }

    private void bookSeatOnEconomySection(Passenger passenger) {
        for(int counter = 5; seats.length > counter ; counter++) {
            if (seats[counter] == false){
                seats[counter] = true;
                economyBoardingPassPrinter(counter, passenger);
                economyClassMonitor++;
                break;
            }
        }
        if(economyClassMonitor == 4){
            checkTheFirstClassSectionForSeatAvailability();
        }
    }

    private void checkTheFirstClassSectionForSeatAvailability() {
        if(firstClassMonitor < 5){
            System.out.println("Economy class seats are full, would you like a first class seat?");
        }
    }

    private void economyBoardingPassPrinter(int counter, Passenger passenger) {
        counter+=1;
        boardingPass = passenger.toString() + boardingPassForPlane.toString() + " \n Your flight has been booked in the economy section, and your seat number is "+ counter + "\n\n";
    }

    private void bookSeatsOnFirstClassSection(Passenger passenger) {
        for(int counter = 0; counter < 5; counter++) {
            if (seats[counter] == false){
                seats[counter] = true;
                firstClassBoardingPassPrinter(counter, passenger);
                firstClassMonitor++;
                break;
            }
        }
        if(firstClassMonitor == 4){
            checkTheEconomySectionForSeatAvailability();
        }
    }

    private void checkTheEconomySectionForSeatAvailability() {
        if(economyClassMonitor < 5){
            System.out.println("First class seats are full, would you like an economy class seat?");
        }
    }

    private void firstClassBoardingPassPrinter(int counter, Passenger passenger) {
        counter+=1;
        boardingPass = passenger.toString() + boardingPassForPlane.toString() + "\n Your flight has been booked in the first class section, and your seat number is "+ counter + "\n\n";
    }

    public String getBoardingPass() {
        return boardingPass;
    }

    public boolean getSeatsBySeatNumber(int number){
        try{
            return  getSeats()[number];
        }catch (ArrayIndexOutOfBoundsException error){
            throw new FlightSeatDoesNotExist("There are only ten seats on this flight. abi you wan hang for window");
        }
    }

    public  static class FlightSeatDoesNotExist extends ArrayIndexOutOfBoundsException{
        public  FlightSeatDoesNotExist(String message){
            super(message);
        }
    }
}

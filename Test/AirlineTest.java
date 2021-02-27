import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {
    Airline plane;
    Passenger passenger;
    BoardingPass boardingPass;

    @BeforeEach
    void setUp() {
        plane = new Airline();
        passenger = new Passenger("Alan", "Rodrick");
        boardingPass = new BoardingPass("Lagos", "Maldives","02/10/22","03/10/22","09:00A.M");
    }

    @AfterEach
    void tearDown() {
    }

  @Test
    void testThatPlaneHasAvailableSeats(){
        boolean[] seats = new boolean[10];
        assertArrayEquals(seats, plane.getSeats());
        assertEquals(seats.length, plane.getSeats().length);
    }

    @Test
    void testThatSeatsOnThePlaneCanBeBooked(){
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        assertTrue(plane.getSeats()[0]);

        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        assertTrue(plane.getSeats()[1]);

        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        assertTrue(plane.getSeats()[2]);

        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        assertTrue(plane.getSeats()[5]);

        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        assertTrue(plane.getSeats()[6]);

        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        assertTrue(plane.getSeats()[7]);

        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        assertTrue(plane.getSeats()[8]);
    }

    @Test
    void testThatPassengerDetailsCanBeGotten(){
        passenger.setFirstName("Alani");
        assertEquals("Alani", passenger.getFirstName());

        passenger.setLastName("Max");
        assertEquals("Max", passenger.getLastName());
    }

    @Test
    void testThatTheBoardingPassCanBedPrinted(){
        boardingPass.setDepartureCity("Lagos");
        assertEquals("Lagos", boardingPass.getDepartureCity());

        boardingPass.setArrivalCity("Nairobi");
        assertEquals("Nairobi", boardingPass.getArrivalCity());

        boardingPass.setDepartureTime("09:45 A.M");
        assertEquals("09:45 A.M", boardingPass.getDepartureTime());

        boardingPass.setArrivalDate("1/1/2016");
        assertEquals("1/1/2016", boardingPass.getArrivalDate());

        boardingPass.setDepartureDate("25/02/2021");
        assertEquals("25/02/2021", boardingPass.getDepartureDate());
        System.out.println(passenger.toString() + boardingPass.toString());
    }

    @Test
    void testThatPassengerCanBeCreatedAndGivenSeat(){
        passenger = new Passenger("Harvey", "Osiris");

        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        System.out.println(plane.getBoardingPass());

        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        System.out.println(plane.getBoardingPass());
    }

    @Test
    void testThatFlightSeatCanBeAlternatedFromEconomyTFirstClassWhenFull(){
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
        plane.bookSeatsOnPlane(FlightSection.ECONOMY, passenger);
    }

    @Test
    void testThatFlightSeatCanBeAlternatedFromFirstClassEconomyClassWhenFull(){
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
        plane.bookSeatsOnPlane(FlightSection.FIRSTCLASS, passenger);
    }

    @Test
    void testThatExceptionsAreThrown(){
        assertThrows(Airline.FlightSeatDoesNotExist.class, ()-> plane.getSeatsBySeatNumber(12));
    }



}
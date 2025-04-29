import java.util.Scanner;

class Bus {
    String busNumber, route;
    int totalSeats, bookedSeats;

    Bus(String busno, String rout, int total, int booked) {
        this.busNumber = busno;
        this.route = rout;
        this.totalSeats = total;
        this.bookedSeats = booked;
    }

    int bookTicket(int seats) {
        if (seats > totalSeats - bookedSeats) {
            System.out.println("Not enough seats available.");
            return bookedSeats;
        }
        bookedSeats += seats;
        return bookedSeats;
    }

    int cancelTicket(int seats) {
        if (seats > bookedSeats) {
            System.out.println("Not enough seats booked to cancel.");
            return bookedSeats;
        }
        bookedSeats -= seats;
        return bookedSeats;
    }

    void display() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + route);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
    }
}

class Passenger {
    String passengerId, name;

    Passenger(String passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }

    void bookBus(Bus bus, int seats) {
        System.out.println("\nTICKET BOOKING");
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Passenger Name: " + name);

        int booked = bus.bookTicket(seats);
        System.out.println("Booked Seats: " + booked);
        bus.display();
        System.out.println("Remaining Seats: " + (bus.totalSeats - bus.bookedSeats));
    }

    void cancelBooking(Bus bus, int seats) {
        System.out.println("\nTICKET CANCELLATION");
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Passenger Name: " + name);
        System.out.println("Total Seat to cancel: "+ seats);
        bus.cancelTicket(seats);
        bus.display();
        System.out.println("Remaining Seats: " + (bus.totalSeats - bus.bookedSeats));
    }
}

public class passenger2 {
    public static void main(String[] args) {
        Bus obj = new Bus("WB-12-6557", "Delhi to Mumbai", 30, 0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PassengerID");
        String passengerId = sc.next();
        System.out.println("Enter the passenger name");
        String name = sc.next();

        Passenger passenger = new Passenger(passengerId, name);

        passenger.bookBus(obj, 15);
        passenger.cancelBooking(obj, 5);
    }
}
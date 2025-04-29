import java.util.Scanner;
class Bus
{
	String BusNumber, route;
	int totalSeats, bookedSeats;

	Bus(String busno, String rout, int total, int booked)
	{
		this.BusNumber = busno;
		this.route = rout;
		this.totalSeats = total;
		this.bookedSeats = booked;
	}
	int bookTicket(int seats)
	{
		bookedSeats = bookedSeats + seats;
		return bookedSeats;
	}

	int cancelTicket(int seats)
	{
		bookedSeats = bookedSeats - seats;
		return bookedSeats;
	}
	void display()
	{
		System.out.println("Bus Number: "+BusNumber);
		System.out.println("Route: "+route);
		System.out.println("Total Seats: "+totalSeats);
		System.out.println("Booked Seats: "+bookedSeats);
	}
}

class passenger
{	
	
	
	static void bookBus(Bus bus, int seats)
	{
		System.out.println("\nTICKET BOOKING");
		String passengerId, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PassengerID");
		passengerId = sc.next();
		System.out.println("Enter the passenger name");
		name = sc.next();
		
		System.out.println("\nPassenger ID: "+passengerId);
		System.out.println("Passenger Name: "+name);
		int booked = bus.bookTicket(seats);
		System.out.println("Booked Seats: "+booked);
		
		bus.display();
		
		
	}
	static void cancelBooking(Bus bus, int seats)
	{
		System.out.println("\nTICKET CANCELLATION");
		String passengerId, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PassengerID");
		passengerId = sc.next();
		System.out.println("Enter the passenger name");
		name = sc.next();
		
		System.out.println("Passenger ID: "+passengerId);
		System.out.println("Passenger Name: "+name);
		int cancel = bus.cancelTicket(seats);
		System.out.println("\nRemaining Seats that you booked is : "+cancel);
		
		bus.display();
	}

	public static void main(String arg[])
	{
		Bus obj = new Bus("WB-12-6557", "Delhi to Mumbai",30,0);
		
		bookBus(obj, 12);
		cancelBooking(obj, 5);
	} 
}
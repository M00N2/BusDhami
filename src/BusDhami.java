/*
Name: Karan Dhami
Date: 3/3/25
self grade based on the given requirmnets and the correctness of the output: 100%
Testimony:  I didn't cheat Karan Dhami
this code involves several classes and you must call to a parent class as a child class to get certain information.
And to use said information in functions to figure out whether the bus is full or the or if there is a specific person aboard the bus that can be removed
Your code must genearte a very similar output. Make sure create your own list of the passengers.
Do not copy the given passengers. The driver ahs 20 points. Any copy from the sample output will cause losing points
*/

/*
public class BusDhami
    {
    //no code here
    }
*/

class Driver
    {
    public static void main(String[] args)
        {
        Person driver = new Person("John", "Doe", "123-456-7890", "john.doe@email.com", "D123");
        Bus bus = new Bus("8a18s1w", "Mercedes", "EX-S Bus", "91 Octane fuel", false, "LA", "Sacramento", 11, 2400, 1212, 5);//create a Bus object

        bus.setDriver(driver);// contains all the bus drivers information
        Passenger passenger1 = new Passenger("John", "Smith", "123-456-7890", "john.smith@email.com", "1", "2", "3", "2");
        Passenger passenger2 = new Passenger("Emily", "Smith", "987-654-3210", "emily.smith@email.com", "2", "", "3", "2");
        Passenger passenger3 = new Passenger("Michael", "Brown", "555-111-2222", "michael.brown@email.com", "3", "1", "3", "2");
        Passenger passenger4 = new Passenger("Sarah", "Brown", "444-222-3333", "sarah.brown@email.com", "4", "1", "3", "2");
        Passenger passenger5 = new Passenger("David", "Williams", "666-777-8888", "david.williams@email.com", "5", "1", "3", "2");
        Passenger passenger6 = new Passenger("Jessica", "Williams", "999-000-1111", "jessica.williams@email.com", "6", "1", "3", "2");
        Passenger passenger7 = new Passenger("Daniel", "Johnson", "111-222-3333", "daniel.johnson@email.com", "7", "1", "3", "2");
        Passenger passenger8 = new Passenger("Laura", "Johnson", "222-333-4444", "laura.johnson@email.com", "8", "2", "3", "2");
        Passenger passenger9 = new Passenger("James", "Taylor", "333-444-5555", "james.taylor@email.com", "9", "3", "3", "2");
        Passenger passenger10 = new Passenger("Anna", "Taylor", "777-888-9999", "anna.taylor@email.com", "10", "3", "3", "2");

        bus.add(passenger1);
        bus.add(passenger2);
        bus.add(passenger3);
        bus.add(passenger4);
        bus.add(passenger5);
        bus.add(passenger6);
        bus.add(passenger7);
        bus.add(passenger8);
        bus.add(passenger9);
        bus.add(passenger10);

        System.out.println("The starting position for this trip is : " + bus.getOrigin());
        System.out.println("**************************************************\n");
        System.out.println("The final destination for this trip is : " + bus.getDestination());
        System.out.println("**************************************************\n");
        System.out.print("Driver of the bus: ");
        System.out.println(bus.getDriver());
        System.out.println("**************************************************\n");
        System.out.println(bus);//test toString method from the Bus class
        System.out.println("**************************************************\n");
        System.out.println("There is  " + (bus.getCapacity() - bus.getPassengerCount()) + " seat(s) left on the bus");//call seatsLeft method
        System.out.println("**************************************************\n");
        bus.print("Taylor");//call print method to print the list of the passengers with the same last name
        System.out.println("**************************************************\n");
        boolean found = bus.search("John", "Smith");//call the seach method to search for a particular passenger in the Bus
        System.out.println("Searching for Micheal Brown, was he found? " + found);
        System.out.println("**************************************************\n");
        bus.delete("Anna", "Taylor");//call delete method to delete a passenger of your choice from the list
        }
    }
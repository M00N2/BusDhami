class Bus extends Vehicle implements List
    {
    private final int departure;
    private final int arrival;
    private final int numberOfStops;
    private Passenger[] passengers; // creating passengers array
    private int passengerCount; // creating # of passengers currently avalable
    private Person driver; // the variable for the driver
    private String destination; // variable for destination
    private String origin;
    private int capacity;

    public Bus(String plateNumber, String make, String model, String fuelType, boolean isElectric, String destination, String origin, int capacity, int departure, int arrival, int numberOfStops)
        {//constuctor
        super(plateNumber, make, model, fuelType, isElectric);
        this.destination = destination;
        this.origin = origin;
        this.capacity = capacity;
        this.departure = departure;
        this.arrival = arrival;
        this.numberOfStops = numberOfStops;
        this.passengers = new Passenger[capacity]; // Initialize the array and giving it the size of the capacity of the bus
        this.passengerCount = 0;// ammount of passangers in the begining
        }

    public String getOrigin()
        {
        return origin;
        }

    public void setOrigin(String origin)
        {
        this.origin = origin;
        }

    public String getDestination()
        {
        return destination;
        }

    public void setDestination(String destination)
        {
        this.destination = destination;
        }

    public int getCapacity()
        {
        return capacity;
        }

    public void setCapacity(int capacity)
        {
        this.capacity = capacity;
        }

    public Passenger[] getPassengers()
        {
        return passengers;
        }

    public void setPassengers(Passenger[] passengers)
        {
        this.passengers = passengers;
        }

    public int getPassengerCount()
        {
        return passengerCount;
        }

    public void setPassengerCount(int passengerCount)
        {
        this.passengerCount = passengerCount;
        }

    public Person getDriver()
        {
        return driver;
        }

    public void setDriver(Person driver)
        {
        this.driver = driver;
        }


    @Override
    public String toString()
        {
        StringBuilder s = new StringBuilder(super.toString());  // Calls Vehicle's toString for base vehicle info
// I tried several ways to get this to work without using this method since we hadent been taught to my knowlege but this was the only way I could achive functional code
        // Add bus-specific details
        s.append("\nPassenger count: ").append(passengerCount).append(", Destination: ").append(destination).append(", Origin: ").append(origin).append(", Capacity: ").append(capacity).append(", Departure: ").append(departure).append(", Arrival: ").append(arrival).append(", Number of stops: ").append(numberOfStops).append("\n");

        // Loop through all passengers and concatenate their details
        for (int i = 0; i < passengerCount; i++)
            {
            if (passengers[i] != null)
                {
                s.append("\n").append(passengers[i].toString());  // Add each passenger's details
                }
            }

        return s.toString();  // Return the complete bus info
        }

    @Override
    public void add(Object o)
        {// this is looking at the passangers and checking if the bus is full
        if (o instanceof Passenger)
            {
            if (isFull())// if the bus is full condition
                {
                System.out.println("The bus is full. Cannot add more passengers.");// if the bus is full then it outputs that there is no more room
                return;
                }
            passengers[passengerCount++] = (Passenger) o;// if the bus has room
            } else
            {
            System.out.println("Invalid object type. Only passengers can be added.");// if everything else fails
            }
        }

    @Override
    public void delete(String first, String last)// this is deleteing people from the array that meet a certain condition
    { // this is checking for a specific person with a specific first & last name
    for (int i = 0; i < passengerCount; i++)
        {
        if (passengers[i] != null && passengers[i].getFirst().equalsIgnoreCase(first) && passengers[i].getLast().equalsIgnoreCase(last))// checking if first & last name match
            {
            // Shift passengers to fill the gap when passanger removed
            for (int j = i; j < passengerCount - 1; j++)
                {
                passengers[j] = passengers[j + 1];// shifting passangers in the array down to fill in the now removed passenger
                }
            passengers[--passengerCount] = null;
            System.out.println("Passenger " + first + " " + last + " removed.");
            return;
            }
        }
    System.out.println("Passenger not found.");
    }

    @Override
    public void print(String lastName)
        {
        boolean found = false;
        for (int i = 0; i < passengerCount; i++)
            {
            if (passengers[i] != null && passengers[i].getLast().equalsIgnoreCase(lastName))
                {
                System.out.println(passengers[i]);
                found = true;
                }
            }
        if (!found)
            {
            System.out.println("No passengers with last name: " + lastName);
            }
        }

    @Override
    public boolean search(String first, String last)
        {// searching for a person with that specific last name
        for (int i = 0; i < passengerCount; i++)
            {
            if (passengers[i] != null && passengers[i].getFirst().equalsIgnoreCase(first) && passengers[i].getLast().equalsIgnoreCase(last))
                {
                return true;
                }
            }
        return false;
        }

    @Override
    public boolean isFull()
        {//checking if the passanger# is ^ the capacity
        return passengerCount >= capacity;
        }
    }
